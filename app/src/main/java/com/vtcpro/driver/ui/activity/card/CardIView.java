package com.vtcpro.driver.ui.activity.card;

import com.vtcpro.driver.base.MvpView;
import com.vtcpro.driver.data.network.model.Card;

import java.util.List;

public interface CardIView extends MvpView {

    void onSuccess(Object card);

    void onSuccess(List<Card> cards);

    void onError(Throwable e);

    void onSuccessChangeCard(Object card);
}
