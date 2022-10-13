package com.example.examenparcial3.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.examenparcial3.R;
import com.example.examenparcial3.bean.Peliculas;

import java.util.ArrayList;
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
        holder.mPeliNombre.setText(peliculas.title);
        holder.mPeliYear.setText(peliculas.year);
        holder.mPeliRun.setText(peliculas.runtime);

        int index = 0;
        holder.mPeliGenre.setText("");
        for (index = 0; index<peliculas.generes.size(); index++){
            holder.mPeliGenre.append("\n" + peliculas.generes.get(index) + "\n");
        }

        holder.mPeliDirector.setText(peliculas.director);

        holder.mPeliActor.setText(peliculas.actors);
        holder.mPeliPlot.setText(peliculas.plot);

        Glide.with(this.context).load(peliculas.img).into(holder.mPeliImage);



    }

    @Override
    public int getItemCount() {
        return mPeliculas.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private ImageView mPeliImage;
        private TextView mPeliNombre, mPeliYear, mPeliRun, mPeliGenre, mPeliDirector, mPeliActor, mPeliPlot;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mPeliImage = itemView.findViewById(R.id.peliImage);
            mPeliNombre = itemView.findViewById(R.id.peli_name);
            mPeliYear = itemView.findViewById(R.id.peli_año);
            mPeliRun = itemView.findViewById(R.id.tiempo);
            mPeliGenre = itemView.findViewById(R.id.genero);
            mPeliDirector = itemView.findViewById(R.id.director);
            mPeliActor = itemView.findViewById(R.id.actores);
            mPeliPlot = itemView.findViewById(R.id.descripcion);
            mPeliGenre = itemView.findViewById(R.id.genero);

        }

        @Override
        public void onClick(View view) {

        }
    }
}
