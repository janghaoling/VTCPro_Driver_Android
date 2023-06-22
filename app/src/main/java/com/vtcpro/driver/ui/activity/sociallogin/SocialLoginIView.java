package com.vtcpro.driver.ui.activity.sociallogin;

import com.vtcpro.driver.base.MvpView;
import com.vtcpro.driver.data.network.model.Token;

public interface SocialLoginIView extends MvpView {

    void onSuccess(Token token);

    void onError(Throwable e);
}
