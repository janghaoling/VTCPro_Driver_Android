package com.vtcpro.driver.ui.activity.wallet_detail;

import com.vtcpro.driver.base.MvpPresenter;
import com.vtcpro.driver.data.network.model.Transaction;

import java.util.ArrayList;

public interface WalletDetailIPresenter<V extends WalletDetailIView> extends MvpPresenter<V> {
    void setAdapter(ArrayList<Transaction> myList);
}
