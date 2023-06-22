package com.vtcpro.driver.ui.activity.change_password;

import com.vtcpro.driver.base.MvpView;

public interface ChangePasswordIView extends MvpView {


    void onSuccess(Object object);

    void onError(Throwable e);
}
