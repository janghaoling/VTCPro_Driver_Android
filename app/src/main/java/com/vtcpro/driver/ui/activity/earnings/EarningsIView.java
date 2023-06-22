package com.vtcpro.driver.ui.activity.earnings;


import com.vtcpro.driver.base.MvpView;
import com.vtcpro.driver.data.network.model.EarningsList;

public interface EarningsIView extends MvpView {

    void onSuccess(EarningsList earningsLists);

    void onError(Throwable e);
}
