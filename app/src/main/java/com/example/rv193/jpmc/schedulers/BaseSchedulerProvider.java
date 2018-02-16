package com.example.rv193.jpmc.schedulers;

import android.support.annotation.NonNull;

import io.reactivex.Scheduler;

public interface BaseSchedulerProvider {
    @NonNull
    Scheduler getIoThread();

    @NonNull
    Scheduler getMainThread();

    @NonNull
    Scheduler getComputationThread();
}
