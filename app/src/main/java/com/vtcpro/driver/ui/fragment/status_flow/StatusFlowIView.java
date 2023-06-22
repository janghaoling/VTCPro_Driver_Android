package com.vtcpro.driver.ui.fragment.status_flow;

import com.vtcpro.driver.base.MvpView;
import com.vtcpro.driver.data.network.model.TimerResponse;

public interface StatusFlowIView extends MvpView {

    void onSuccess(Object object);

    void onWaitingTimeSuccess(TimerResponse object);

    void onError(Throwable e);
}
