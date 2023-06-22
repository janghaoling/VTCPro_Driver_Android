package com.vtcpro.driver.ui.activity.earnings;


import com.vtcpro.driver.base.MvpPresenter;

public interface EarningsIPresenter<V extends EarningsIView> extends MvpPresenter<V> {

    void getEarnings();
}
