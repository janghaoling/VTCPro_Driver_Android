package com.vtcpro.driver.ui.activity.invite_friend;

import com.vtcpro.driver.base.MvpView;
import com.vtcpro.driver.data.network.model.UserResponse;

public interface InviteFriendIView extends MvpView {

    void onSuccess(UserResponse response);

    void onError(Throwable e);

}
