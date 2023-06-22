package com.vtcpro.driver.ui.fragment.upcoming;


import com.vtcpro.driver.base.MvpPresenter;

import java.util.HashMap;

public interface UpcomingTripIPresenter<V extends UpcomingTripIView> extends MvpPresenter<V> {

    void getUpcoming();

    void assignedCancel(HashMap<String, Object> map);

    void assignedAccepted(HashMap<String, Object> map);
}
