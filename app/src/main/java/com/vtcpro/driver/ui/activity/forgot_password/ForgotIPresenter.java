package com.vtcpro.driver.ui.activity.forgot_password;

import com.vtcpro.driver.base.MvpPresenter;

import java.util.HashMap;

public interface ForgotIPresenter<V extends ForgotIView> extends MvpPresenter<V> {

    void forgot(HashMap<String, Object> obj);

}
