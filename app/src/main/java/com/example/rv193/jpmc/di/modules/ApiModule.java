package com.example.rv193.jpmc.di.modules;

import android.app.Application;
import android.support.annotation.NonNull;

import com.example.rv193.jpmc.schedulers.BaseSchedulerProvider;
import com.example.rv193.jpmc.schedulers.SchedulerProvider;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.concurrent.TimeUnit;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.Cache;
import okhttp3.OkHttpClient;

@Module
public class ApiModule {

    private static final long DISK_CACHE_SIZE = 10*1024*1024;

    @Provides
    Gson provideGson(){
        final GsonBuilder gsonBuilder = new GsonBuilder();
        return gsonBuilder.create();
    }

    @Provides
    @Singleton
    Cache provideCache(@NonNull Application application){
        return new Cache(application.getCacheDir(), DISK_CACHE_SIZE);
    }

    @Provides
    @Singleton
    OkHttpClient provideOkHttpClient(@NonNull Cache cache){
        final OkHttpClient.Builder builder = new OkHttpClient.Builder()
                .cache(cache)
                .connectTimeout(30, TimeUnit.SECONDS)
                .readTimeout(30, TimeUnit.SECONDS)
                .writeTimeout(30,TimeUnit.SECONDS);
        return builder.build();
    }

    @Provides
    @Singleton
    BaseSchedulerProvider provideSchedulerProvider(){return new SchedulerProvider();}
}
