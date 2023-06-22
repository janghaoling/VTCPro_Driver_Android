package com.vtcpro.driver.ui.activity.notification_manager;

import com.vtcpro.driver.base.MvpPresenter;

public interface NotificationManagerIPresenter<V extends NotificationManagerIView> extends MvpPresenter<V> {
    void getNotificationManager();
}
