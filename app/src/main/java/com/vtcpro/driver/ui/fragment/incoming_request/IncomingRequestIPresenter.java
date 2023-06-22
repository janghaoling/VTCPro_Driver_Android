package com.vtcpro.driver.ui.fragment.incoming_request;

import com.vtcpro.driver.base.MvpPresenter;

public interface IncomingRequestIPresenter<V extends IncomingRequestIView> extends MvpPresenter<V> {

    void accept(Integer id);

    void cancel(Integer id);
}
