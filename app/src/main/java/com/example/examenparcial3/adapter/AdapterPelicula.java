package com.example.examenparcial3.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.examenparcial3.R;
import com.example.examenparcial3.bean.Peliculas;

import java.util.List;

public class AdapterPelicula extends RecyclerView.Adapter<AdapterPelicula.ViewHolder> {
    private List<Peliculas> mPeliculas;
    private Context context;
    public AdapterPelicula(List<Peliculas> mPeliculas){
        this.mPeliculas = mPeliculas;
    }
    public void reloadData(List<Peliculas> peliculas) {
        this.mPeliculas = peliculas;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public AdapterPelicula.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        this.context = parent.getContext();

        LayoutInflater inflater = LayoutInflater.from(this.context);

        View contactView = inflater.inflate(R.layout.diseno, parent, false);
        ViewHolder viewHolder = new ViewHolder(contactView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterPelicula.ViewHolder holder, int position) {
        Peliculas peliculas = mPeliculas.get(position);

    }

    @Override
    public int getItemCount() {
        return mPeliculas.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
