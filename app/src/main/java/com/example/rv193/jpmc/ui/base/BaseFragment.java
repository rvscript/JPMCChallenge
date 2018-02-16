package com.example.rv193.jpmc.ui.base;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.widget.Toast;

import javax.inject.Inject;

import dagger.android.DaggerFragment;

public abstract class BaseFragment <T extends BaseContract.Presenter> extends DaggerFragment implements BaseContract.View{

    @Inject T mPresenter;
    public T getPresenter(){return mPresenter;}

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mPresenter.onViewAttached(this);
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mPresenter.onViewDetached();
        super.onDetach();
    }

    @Override
    public void finishView() {
        getActivity().finish();
    }

    @Override
    public void showMessage(@NonNull String string) {
        Toast.makeText(getActivity(), string, Toast.LENGTH_LONG).show();
    }

    @Override
    public void showMessage(@NonNull int message) {
        Toast.makeText(getActivity(), message, Toast.LENGTH_LONG).show();
    }
}