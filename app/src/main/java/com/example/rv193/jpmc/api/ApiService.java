package com.example.rv193.jpmc.api;


import com.example.rv193.jpmc.model.Example;
import io.reactivex.Observable;
import retrofit2.http.GET;

public interface ApiService {
    @GET("posts")
    Observable<Example> getExample();
}
