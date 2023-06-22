package com.vtcpro.driver.ui.activity.sociallogin;

import com.vtcpro.driver.base.MvpPresenter;

import java.util.HashMap;

public interface SocialLoginIPresenter<V extends SocialLoginIView> extends MvpPresenter<V> {

    void loginGoogle(HashMap<String, Object> obj);

    void loginFacebook(HashMap<String, Object> obj);
}
