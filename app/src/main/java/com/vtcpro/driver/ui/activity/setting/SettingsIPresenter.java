package com.vtcpro.driver.ui.activity.setting;

import com.vtcpro.driver.base.MvpPresenter;

public interface SettingsIPresenter<V extends SettingsIView> extends MvpPresenter<V> {
    void changeLanguage(String languageID);
}
