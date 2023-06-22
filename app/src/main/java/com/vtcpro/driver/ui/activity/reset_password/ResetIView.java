package com.vtcpro.driver.ui.activity.reset_password;

import com.vtcpro.driver.base.MvpView;

public interface ResetIView extends MvpView {

    void onSuccess(Object object);

    void onError(Throwable e);
}
