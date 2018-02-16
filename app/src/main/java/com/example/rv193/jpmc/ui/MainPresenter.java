package com.example.rv193.jpmc.ui;

import com.example.rv193.jpmc.di.ActivityScope;
import com.example.rv193.jpmc.ui.base.BasePresenter;

import javax.inject.Inject;

@ActivityScope
public class MainPresenter extends BasePresenter<MainContract.View> implements MainContract.Presenter {

    @Inject
    public MainPresenter() {
    }
}
