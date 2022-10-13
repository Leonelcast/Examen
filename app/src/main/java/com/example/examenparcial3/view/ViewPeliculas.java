package com.example.examenparcial3.view;

import com.example.examenparcial3.bean.Peliculas;

import java.util.List;

public interface ViewPeliculas {

    void onPeliculaSuccess(List<Peliculas> peliculas);
    void onPeliculaError(String msg);
}
