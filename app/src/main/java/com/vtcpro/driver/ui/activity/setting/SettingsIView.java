package com.vtcpro.driver.ui.activity.setting;

import com.vtcpro.driver.base.MvpView;

public interface SettingsIView extends MvpView {

    void onSuccess(Object o);

    void onError(Throwable e);

}
