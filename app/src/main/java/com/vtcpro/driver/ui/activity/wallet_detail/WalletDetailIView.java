package com.vtcpro.driver.ui.activity.wallet_detail;

import com.vtcpro.driver.base.MvpView;
import com.vtcpro.driver.data.network.model.Transaction;

import java.util.ArrayList;

public interface WalletDetailIView extends MvpView {
    void setAdapter(ArrayList<Transaction> myList);
}
