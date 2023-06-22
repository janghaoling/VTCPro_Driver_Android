package com.vtcpro.driver.ui.bottomsheetdialog.cancel;

import com.vtcpro.driver.base.MvpView;
import com.vtcpro.driver.data.network.model.CancelResponse;

import java.util.List;

public interface CancelDialogIView extends MvpView {

    void onSuccessCancel(Object object);

    void onError(Throwable e);

    void onSuccess(List<CancelResponse> response);

    void onReasonError(Throwable e);
}
