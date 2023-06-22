package com.vtcpro.driver.ui.bottomsheetdialog.invoice_flow;

import com.vtcpro.driver.base.MvpView;

public interface InvoiceDialogIView extends MvpView {

    void onSuccess(Object object);

    void onError(Throwable e);
}
