package com.example.examenparcial3.presenter;

import com.example.examenparcial3.bean.Peliculas;

import java.util.List;

public interface IPeliculaPresenter {
    void getPeliculas();
    void onPeliculasSuccess(List<Peliculas> books);
    void onPeliculasError(String msg);
}
