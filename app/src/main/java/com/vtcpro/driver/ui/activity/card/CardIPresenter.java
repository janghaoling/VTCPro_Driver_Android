package com.vtcpro.driver.ui.activity.card;

import com.vtcpro.driver.base.MvpPresenter;

public interface CardIPresenter<V extends CardIView> extends MvpPresenter<V> {

    void deleteCard(String cardId);

    void card();

    void changeCard(String cardId);
}
