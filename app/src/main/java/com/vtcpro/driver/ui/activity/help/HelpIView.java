package com.vtcpro.driver.ui.activity.help;

import com.vtcpro.driver.base.MvpView;
import com.vtcpro.driver.data.network.model.Help;

public interface HelpIView extends MvpView {

    void onSuccess(Help object);

    void onError(Throwable e);
}
