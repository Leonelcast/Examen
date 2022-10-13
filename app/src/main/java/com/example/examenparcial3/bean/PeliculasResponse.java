package com.example.examenparcial3.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PeliculasResponse {
    @SerializedName("movies")
    public List<Peliculas> movies;
}
