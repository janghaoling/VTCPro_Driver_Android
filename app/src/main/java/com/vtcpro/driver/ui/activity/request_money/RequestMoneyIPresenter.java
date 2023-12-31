package com.vtcpro.driver.ui.activity.request_money;

import com.vtcpro.driver.base.MvpPresenter;

public interface RequestMoneyIPresenter<V extends RequestMoneyIView> extends MvpPresenter<V> {

    void getRequestedData();

    void requestMoney(Double requestedAmt);

    void removeRequestMoney(int id);

}
