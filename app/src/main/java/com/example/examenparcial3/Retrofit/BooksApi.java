package com.example.examenparcial3.Retrofit;

import com.example.examenparcial3.bean.Book;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface BooksApi {

    @GET("/books.json")
    Call<List<Book>> getBooks();

}
