package com.vtcpro.driver.ui.activity.wallet;

import com.vtcpro.driver.base.MvpView;
import com.vtcpro.driver.data.network.model.WalletMoneyAddedResponse;
import com.vtcpro.driver.data.network.model.WalletResponse;

public interface WalletIView extends MvpView {

    void onSuccess(WalletResponse response);

    void onSuccess(WalletMoneyAddedResponse response);

    void onError(Throwable e);
}
