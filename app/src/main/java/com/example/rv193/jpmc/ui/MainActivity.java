package com.example.rv193.jpmc.ui;

import android.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.rv193.jpmc.R;
import com.example.rv193.jpmc.ui.base.BaseActivity;

public class MainActivity extends BaseActivity<MainContract.Presenter> implements MainContract.View{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public void showLoading(boolean isLoading) {

    }
}
