package com.vtcpro.driver.ui.activity.upcoming_detail;


import com.vtcpro.driver.base.MvpView;
import com.vtcpro.driver.data.network.model.HistoryDetail;

public interface UpcomingTripDetailIView extends MvpView {

    void onSuccess(HistoryDetail historyDetail);

    void onError(Throwable e);
}
