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
    @SerializedName("generes")
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


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    public ArrayList getGeneres() {
        return generes;
    }

    public void setGeneres(ArrayList generes) {
        this.generes = generes;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
