package com.vtcpro.driver.ui.activity.instant_ride;

import com.vtcpro.driver.base.MvpView;
import com.vtcpro.driver.data.network.model.EstimateFare;
import com.vtcpro.driver.data.network.model.TripResponse;

public interface InstantRideIView extends MvpView {

    void onSuccess(EstimateFare estimateFare);

    void onSuccess(TripResponse response);

    void onError(Throwable e);

}
