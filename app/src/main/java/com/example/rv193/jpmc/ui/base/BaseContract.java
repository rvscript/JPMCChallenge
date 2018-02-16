package com.example.rv193.jpmc.ui.base;

import android.support.annotation.NonNull;
import android.support.annotation.StringRes;

/**
 * Created by rv193 on 2/15/2018.
 */

public interface BaseContract {
    interface View{
        void showMessage(@NonNull String string);
        void showMessage(@StringRes int message);
        void showLoading(boolean isLoading);
        void finishView();
    }
    interface Presenter<T extends View>{
        void onViewAttached(@NonNull T view);
        void onViewDetached();
    }
}
