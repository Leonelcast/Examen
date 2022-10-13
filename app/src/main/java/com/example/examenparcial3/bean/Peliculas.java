package com.example.examenparcial3.bean;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Peliculas {
    @SerializedName("id")
    public String id;
    @SerializedName("title")
    public String title;
    @SerializedName("year")
    public String year;
    @SerializedName("runtime")
    public String runtime;
    @SerializedName("genres")
    public ArrayList generes;
    @SerializedName("director")
    public String director;
    @SerializedName("actors")
    public String actors;
    @SerializedName("plot")
    public String plot;
    @SerializedName("posterUrl")
    public String img;


    public void Peliculas(){}

    public Peliculas(String id, String title, String year, String runtime, ArrayList generes, String director, String actors, String plot, String img) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.runtime = runtime;
        this.generes = generes;
        this.director = director;
        this.actors = actors;
        this.plot = plot;
        this.img = img;
    }
}
