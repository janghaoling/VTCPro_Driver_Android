package com.vtcpro.driver.ui.activity.request_money;

import com.vtcpro.driver.base.MvpView;
import com.vtcpro.driver.data.network.model.RequestDataResponse;

public interface RequestMoneyIView extends MvpView {

    void onSuccess(RequestDataResponse response);

    void onSuccess(Object response);

    void onError(Throwable e);

}
