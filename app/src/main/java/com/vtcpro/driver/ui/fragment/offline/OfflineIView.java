package com.vtcpro.driver.ui.fragment.offline;

import com.vtcpro.driver.base.MvpView;

public interface OfflineIView extends MvpView {

    void onSuccess(Object object);

    void onError(Throwable e);
}
