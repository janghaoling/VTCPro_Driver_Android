package com.vtcpro.driver.ui.fragment.past;


import com.vtcpro.driver.base.MvpView;
import com.vtcpro.driver.data.network.model.HistoryList;

import java.util.List;

public interface PastTripIView extends MvpView {

    void onSuccess(List<HistoryList> historyList);

    void onError(Throwable e);
}
