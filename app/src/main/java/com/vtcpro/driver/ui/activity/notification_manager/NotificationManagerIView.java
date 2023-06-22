package com.vtcpro.driver.ui.activity.notification_manager;

import com.vtcpro.driver.base.MvpView;
import com.vtcpro.driver.data.network.model.NotificationManager;

import java.util.List;

public interface NotificationManagerIView extends MvpView {

    void onSuccess(List<NotificationManager> managers);

    void onError(Throwable e);

}