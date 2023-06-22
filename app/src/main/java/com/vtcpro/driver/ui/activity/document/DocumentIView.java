package com.vtcpro.driver.ui.activity.document;

import com.vtcpro.driver.base.MvpView;
import com.vtcpro.driver.data.network.model.DriverDocumentResponse;

public interface DocumentIView extends MvpView {

    void onSuccess(DriverDocumentResponse response);

    void onDocumentSuccess(DriverDocumentResponse response);

    void onError(Throwable e);

    void onSuccessLogout(Object object);

}
