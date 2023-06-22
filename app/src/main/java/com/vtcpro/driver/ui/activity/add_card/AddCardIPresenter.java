package com.vtcpro.driver.ui.activity.add_card;

import com.vtcpro.driver.base.MvpPresenter;

public interface AddCardIPresenter<V extends AddCardIView> extends MvpPresenter<V> {

    void addCard(String stripeToken);
}
