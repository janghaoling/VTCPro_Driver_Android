package com.vtcpro.driver.ui.activity.summary;


import com.vtcpro.driver.base.MvpView;
import com.vtcpro.driver.data.network.model.Summary;

public interface SummaryIView extends MvpView {

    void onSuccess(Summary object);

    void onError(Throwable e);
}
