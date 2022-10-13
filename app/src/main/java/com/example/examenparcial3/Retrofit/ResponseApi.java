package com.example.examenparcial3.Retrofit;

import com.example.examenparcial3.bean.Peliculas;
import com.example.examenparcial3.bean.PeliculasResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ResponseApi {
    @GET("/erik-sytnyk/movies-list/master/db.json")
     Call<PeliculasResponse> getPeliculas();

}
