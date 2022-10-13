package com.example.examenparcial3.Retrofit;

import com.example.examenparcial3.bean.Peliculas;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ResponseApi {
    @GET("/db.json")
     Call<List<Peliculas>> getPeliculas();

}
