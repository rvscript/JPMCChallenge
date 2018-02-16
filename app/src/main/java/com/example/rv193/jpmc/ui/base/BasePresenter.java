package com.example.rv193.jpmc.ui.base;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

public class BasePresenter <T extends BaseContract.View> implements BaseContract.Presenter<T>{

    @Nullable private T mView;

    public T getview(){return mView;}

    @Override
    public void onViewAttached(@NonNull T view) {
        mView = view;
    }

    @Override
    public void onViewDetached() {
        mView = null;
    }
}
