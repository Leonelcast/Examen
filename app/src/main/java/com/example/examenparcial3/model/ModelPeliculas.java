package com.example.examenparcial3.model;

import com.example.examenparcial3.Retrofit.ResponseApi;
import com.example.examenparcial3.bean.Peliculas;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;


public class ModelPeliculas {

    private ResponseApi api;

    Call<List<Peliculas>> peliCall = api.getPeliculas();
    


}
