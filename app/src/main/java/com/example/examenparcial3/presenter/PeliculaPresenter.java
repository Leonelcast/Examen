package com.example.examenparcial3.presenter;

import com.example.examenparcial3.bean.Peliculas;
import com.example.examenparcial3.model.IModelPeliculas;
import com.example.examenparcial3.model.ModelPeliculas;
import com.example.examenparcial3.view.ViewPeliculas;

import java.util.List;

public class PeliculaPresenter implements IPeliculaPresenter{
    private ViewPeliculas view;
    private IModelPeliculas model;

    public PeliculaPresenter(ViewPeliculas view){
        this.view = view;
        this.model = new ModelPeliculas(this);
    }
    @Override
    public void getPeliculas(){this.model.getPeliculas();}
    @Override
    public void onPeliculasSuccess(List<Peliculas> peliculas){
        if(view == null){
            return;
        }
        this.view.onPeliculaSuccess(peliculas);
    }

    @Override
    public void onPeliculasError(String msg) {
        if(view == null){
            return;
        }
        this.view.onPeliculaError(msg);
    }
}
