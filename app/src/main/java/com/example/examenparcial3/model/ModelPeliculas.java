package com.example.examenparcial3.model;

import com.example.examenparcial3.Retrofit.ApiClient;
import com.example.examenparcial3.Retrofit.ResponseApi;
import com.example.examenparcial3.bean.Peliculas;
import com.example.examenparcial3.bean.PeliculasResponse;
import com.example.examenparcial3.presenter.IPeliculaPresenter;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class ModelPeliculas implements IModelPeliculas{
    private IPeliculaPresenter presenter;
    private ResponseApi api;

    public ModelPeliculas(IPeliculaPresenter presenter){
        this.presenter = presenter;
        api = ApiClient.getInstance().create(ResponseApi.class);
    }



    @Override
    public void getPeliculas() {
        Call<PeliculasResponse> peliCall = api.getPeliculas();
        peliCall.enqueue(new Callback<PeliculasResponse>() {
            @Override
            public void onResponse(Call<PeliculasResponse> call, Response<PeliculasResponse> response) {
                presenter.onPeliculasSuccess(response.body().movies);
            }

            @Override
            public void onFailure(Call<PeliculasResponse> call, Throwable t) {
                presenter.onPeliculasError("Error al obtener datos de api");
            }
        });

    }
}
