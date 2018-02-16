package com.example.rv193.jpmc.di.component;

import android.app.Application;

import com.example.rv193.jpmc.AppApplication;
import com.example.rv193.jpmc.di.modules.ApiModule;
import com.example.rv193.jpmc.di.modules.AppModule;
import com.example.rv193.jpmc.di.modules.MainActivityModule;
import com.example.rv193.jpmc.di.modules.RetrofitModule;
import com.example.rv193.jpmc.di.modules.ServiceModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component(modules = {
        AndroidSupportInjectionModule.class,
        AppModule.class,
        ApiModule.class,
        RetrofitModule.class,
        ServiceModule.class,
        MainActivityModule.class
})
public interface AppComponent {

    void inject(AppApplication appApplication);

    @Component.Builder
    interface Builder{
        AppComponent build();

        @BindsInstance
        Builder application(Application application);
    }
}
