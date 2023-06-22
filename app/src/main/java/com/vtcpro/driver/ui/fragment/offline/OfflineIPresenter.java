package com.vtcpro.driver.ui.fragment.offline;

import com.vtcpro.driver.base.MvpPresenter;

import java.util.HashMap;

public interface OfflineIPresenter<V extends OfflineIView> extends MvpPresenter<V> {

    void providerAvailable(HashMap<String, Object> obj);
}
