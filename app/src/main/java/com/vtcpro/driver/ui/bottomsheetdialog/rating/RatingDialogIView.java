package com.vtcpro.driver.ui.bottomsheetdialog.rating;

import com.vtcpro.driver.base.MvpView;
import com.vtcpro.driver.data.network.model.Rating;

public interface RatingDialogIView extends MvpView {

    void onSuccess(Rating rating);

    void onError(Throwable e);
}
