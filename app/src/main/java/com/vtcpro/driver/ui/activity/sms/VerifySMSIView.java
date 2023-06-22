package com.vtcpro.driver.ui.activity.sms;

import com.vtcpro.driver.base.MvpView;
import com.vtcpro.driver.data.network.model.ResponseSMS;

public interface VerifySMSIView extends MvpView {

    void onSuccess(ResponseSMS result);

    void onError(Throwable e);

}
