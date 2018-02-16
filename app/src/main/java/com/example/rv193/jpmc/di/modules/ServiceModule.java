package com.example.rv193.jpmc.di.modules;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;

import com.example.rv193.jpmc.api.ApiService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

@Module
public class ServiceModule {

    @Provides
    @Singleton
    ApiService provideVenueService(@NonNull Retrofit retrofit){
        return retrofit.create(ApiService.class);
    }
}
