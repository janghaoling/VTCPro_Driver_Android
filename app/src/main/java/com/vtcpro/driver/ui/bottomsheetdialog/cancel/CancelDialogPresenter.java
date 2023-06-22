package com.vtcpro.driver.ui.bottomsheetdialog.cancel;

import com.vtcpro.driver.base.BasePresenter;
import com.vtcpro.driver.data.network.APIClient;

import java.util.HashMap;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class CancelDialogPresenter<V extends CancelDialogIView> extends BasePresenter<V> implements CancelDialogIPresenter<V> {


    @Override
    public void cancelRequest(HashMap<String, Object> obj) {
        getCompositeDisposable().add(
                APIClient
                        .getAPIClient()
                        .cancelRequest(obj)
                        .subscribeOn(Schedulers.computation())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(
                                trendsResponse -> getMvpView().onSuccessCancel(trendsResponse),
                                throwable -> getMvpView().onError(throwable)
                        )
        );
    }

    @Override
    public void getReasons() {
        getCompositeDisposable().add(APIClient
                .getAPIClient()
                .getCancelReasons()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(getMvpView()::onSuccess, getMvpView()::onReasonError));
    }
}
