package com.vtcpro.driver.ui.fragment.upcoming;

import com.vtcpro.driver.base.MvpView;
import com.vtcpro.driver.data.network.model.HistoryList;

import java.util.List;

public interface UpcomingTripIView extends MvpView {

    void onSuccess(List<HistoryList> historyList);

    void onSuccessCancel(Object o);

    void onSuccessAccepted(Object o);

    void onError(Throwable e);
}
