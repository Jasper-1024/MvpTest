package com.jasperhale.mvptest.View;

import android.os.Bundle;

import com.jasperhale.mvptest.BaseClass.BaseActivity;
import com.jasperhale.mvptest.Presenter.Presenter;
import com.jasperhale.mvptest.Presenter.mPresenter;
import com.jasperhale.mvptest.R;

public class MainActivity extends BaseActivity<Viewif, mPresenter> implements Viewif{

    Presenter presenter;
    //Presenter初始化
    public mPresenter initPresenter() {
        return new mPresenter(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //presenter初始化
        presenter = mpresenter;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
