package com.example.rv193.jpmc.schedulers;

import android.support.annotation.NonNull;

import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

import static io.reactivex.android.schedulers.AndroidSchedulers.mainThread;

/**
 * Created by rv193 on 2/15/2018.
 */

public class SchedulerProvider implements BaseSchedulerProvider{
    @NonNull
    @Override
    public Scheduler getIoThread() {
        return Schedulers.io();
    }

    @NonNull
    @Override
    public Scheduler getMainThread() {
        return AndroidSchedulers.mainThread();
    }

    @NonNull
    @Override
    public Scheduler getComputationThread() {
        return Schedulers.computation();
    }
}
