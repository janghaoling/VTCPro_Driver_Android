package com.vtcpro.driver.ui.activity.add_card;

import com.vtcpro.driver.base.MvpView;

public interface AddCardIView extends MvpView {

    void onSuccess(Object card);

    void onError(Throwable e);
}
