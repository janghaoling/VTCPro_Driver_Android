package com.vtcpro.driver.ui.activity.wallet_detail;

import com.vtcpro.driver.base.BasePresenter;
import com.vtcpro.driver.data.network.model.Transaction;

import java.util.ArrayList;

public class WalletDetailPresenter<V extends WalletDetailIView> extends BasePresenter<V> implements WalletDetailIPresenter<V> {
    @Override
    public void setAdapter(ArrayList<Transaction> myList) {
        getMvpView().setAdapter(myList);
    }
}
