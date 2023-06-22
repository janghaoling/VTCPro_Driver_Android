package com.vtcpro.driver.ui.activity.password;

import com.vtcpro.driver.base.MvpView;
import com.vtcpro.driver.data.network.model.ForgotResponse;
import com.vtcpro.driver.data.network.model.User;

public interface PasswordIView extends MvpView {

    void onSuccess(ForgotResponse forgotResponse);

    void onSuccess(User object);

    void onError(Throwable e);
}
