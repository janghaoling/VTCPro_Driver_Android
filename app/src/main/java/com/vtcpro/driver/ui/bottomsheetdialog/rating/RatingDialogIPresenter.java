package com.vtcpro.driver.ui.bottomsheetdialog.rating;

import com.vtcpro.driver.base.MvpPresenter;

import java.util.HashMap;

public interface RatingDialogIPresenter<V extends RatingDialogIView> extends MvpPresenter<V> {

    void rate(HashMap<String, Object> obj, Integer id);
}
