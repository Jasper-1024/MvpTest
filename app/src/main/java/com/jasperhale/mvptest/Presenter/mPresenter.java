package com.jasperhale.mvptest.Presenter;

import android.util.Log;

import com.jasperhale.mvptest.BaseClass.BasePresenter;
import com.jasperhale.mvptest.Model.Model;
import com.jasperhale.mvptest.Model.mModel;
import com.jasperhale.mvptest.View.Viewif;


/**
 * Created by ZHANG on 2017/3/25.
 */

public class mPresenter extends BasePresenter<Viewif> implements Presenter {
    private Model mModel;

    public mPresenter(Viewif view) {
        this.attach(view);
        this.mModel = new mModel();
    }
}