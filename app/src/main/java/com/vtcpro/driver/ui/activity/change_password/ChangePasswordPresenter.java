package com.vtcpro.driver.ui.activity.change_password;

import com.vtcpro.driver.base.BasePresenter;
import com.vtcpro.driver.data.network.APIClient;

import java.util.HashMap;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class ChangePasswordPresenter<V extends ChangePasswordIView> extends BasePresenter<V> implements ChangePasswordIPresenter<V> {


    @Override
    public void changePassword(HashMap<String, Object> obj) {
        getCompositeDisposable().add(
                APIClient
                        .getAPIClient()
                        .changePassword(obj)
                        .subscribeOn(Schedulers.computation())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(
                                trendsResponse -> getMvpView().onSuccess(trendsResponse),
                                throwable -> getMvpView().onError(throwable)
                        )
        );
    }
}
