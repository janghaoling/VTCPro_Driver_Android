package com.vtcpro.driver.ui.activity.summary;


import com.vtcpro.driver.base.MvpPresenter;

public interface SummaryIPresenter<V extends SummaryIView> extends MvpPresenter<V> {

    void getSummary();
}
