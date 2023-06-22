package com.vtcpro.driver.ui.activity.forgot_password;

import com.vtcpro.driver.base.MvpView;
import com.vtcpro.driver.data.network.model.ForgotResponse;

public interface ForgotIView extends MvpView {

    void onSuccess(ForgotResponse forgotResponse);

    void onError(Throwable e);
}
