package com.example.rv193.jpmc.di.modules;

import com.example.rv193.jpmc.di.ActivityScope;
import com.example.rv193.jpmc.ui.MainActivity;
import com.example.rv193.jpmc.ui.MainContract;
import com.example.rv193.jpmc.ui.MainPresenter;

import dagger.Binds;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class MainActivityModule {

    @ContributesAndroidInjector
    @ActivityScope
    abstract MainActivity mainActivity();

    @Binds
    public abstract MainContract.Presenter provideMainPresenter(MainPresenter mainPresenter);
}
