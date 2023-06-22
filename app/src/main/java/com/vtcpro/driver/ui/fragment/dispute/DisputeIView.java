package com.vtcpro.driver.ui.fragment.dispute;

import com.vtcpro.driver.base.MvpView;
import com.vtcpro.driver.data.network.model.DisputeResponse;

import java.util.List;

public interface DisputeIView extends MvpView {

    void onSuccessDispute(List<DisputeResponse> responseList);

    void onSuccess(Object object);

    void onError(Throwable e);
}
