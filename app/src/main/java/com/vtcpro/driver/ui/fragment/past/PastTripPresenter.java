package com.vtcpro.driver.ui.fragment.past;

import com.vtcpro.driver.base.BasePresenter;
import com.vtcpro.driver.data.network.APIClient;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class PastTripPresenter<V extends PastTripIView> extends BasePresenter<V> implements PastTripIPresenter<V> {

    @Override
    public void getHistory() {
        getCompositeDisposable().add(APIClient
                .getAPIClient()
                .getHistory()
                .subscribeOn(Schedulers.computation())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(getMvpView()::onSuccess, getMvpView()::onError));
    }
}
