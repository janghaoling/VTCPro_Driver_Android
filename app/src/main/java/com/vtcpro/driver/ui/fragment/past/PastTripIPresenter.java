package com.vtcpro.driver.ui.fragment.past;


import com.vtcpro.driver.base.MvpPresenter;

public interface PastTripIPresenter<V extends PastTripIView> extends MvpPresenter<V> {

    void getHistory();

}
