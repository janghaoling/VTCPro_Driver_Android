package com.vtcpro.driver.ui.activity.earnings;

import com.vtcpro.driver.base.BasePresenter;
import com.vtcpro.driver.data.network.APIClient;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class EarningsPresenter<V extends EarningsIView> extends BasePresenter<V> implements EarningsIPresenter<V> {
    @Override
    public void getEarnings() {
        getCompositeDisposable().add(
                APIClient
                        .getAPIClient()
                        .getEarnings()
                        .subscribeOn(Schedulers.computation())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(
                                trendsResponse -> getMvpView().onSuccess(trendsResponse),
                                throwable -> getMvpView().onError(throwable)
                        )
        );
    }
}
