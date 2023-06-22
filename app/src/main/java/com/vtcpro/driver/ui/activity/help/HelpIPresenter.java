package com.vtcpro.driver.ui.activity.help;


import com.vtcpro.driver.base.MvpPresenter;

public interface HelpIPresenter<V extends HelpIView> extends MvpPresenter<V> {

    void getHelp();
}
