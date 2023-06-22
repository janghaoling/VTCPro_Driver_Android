package com.vtcpro.driver.ui.activity.past_detail;


import com.vtcpro.driver.base.MvpView;
import com.vtcpro.driver.data.network.model.HistoryDetail;

public interface PastTripDetailIView extends MvpView {

    void onSuccess(HistoryDetail historyDetail);

    void onError(Throwable e);
}
