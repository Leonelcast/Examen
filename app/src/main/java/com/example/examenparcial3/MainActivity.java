package com.example.examenparcial3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.example.examenparcial3.adapter.AdapterPelicula;
import com.example.examenparcial3.adapter.BooksAdapter;
import com.example.examenparcial3.bean.Book;
import com.example.examenparcial3.bean.Peliculas;
import com.example.examenparcial3.presenter.BookPresenter;
import com.example.examenparcial3.presenter.IBookPresenter;
import com.example.examenparcial3.presenter.IPeliculaPresenter;
import com.example.examenparcial3.presenter.PeliculaPresenter;
import com.example.examenparcial3.view.IBookView;
import com.example.examenparcial3.view.ViewPeliculas;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements ViewPeliculas, IBookView {
    private IPeliculaPresenter peliculaPresenter;
    private AdapterPelicula adapter;
    private IBookPresenter bookPresenter;
    private BooksAdapter adapter2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.peliculaPresenter = new PeliculaPresenter(this);
        this.peliculaPresenter.getPeliculas();
        RecyclerView rvPeliculas = (RecyclerView) findViewById(R.id.pelicula_list);
        this.adapter = new AdapterPelicula(new ArrayList<>());
        rvPeliculas.setAdapter(adapter);
        rvPeliculas.setLayoutManager(new LinearLayoutManager(this));


        //
        this.bookPresenter = new BookPresenter(this);
        this.bookPresenter.getBooks();

        RecyclerView rvBooks = (RecyclerView) findViewById(R.id.book_list);
        this.adapter2 = new BooksAdapter(new ArrayList<>());
        rvBooks.setAdapter(adapter2);
        rvBooks.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public void onPeliculaSuccess(List<Peliculas> peliculas) {
        adapter.reloadData(peliculas);
    }

    @Override
    public void onPeliculaError(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_LONG);
    }

    @Override
    public void onBookSuccess(List<Book> books) {
        adapter2.reloadData(books);
    }

    @Override
    public void onBookError(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_LONG)
                .show();
    }
}