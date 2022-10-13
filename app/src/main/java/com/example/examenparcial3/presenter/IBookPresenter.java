package com.example.examenparcial3.presenter;

import com.example.examenparcial3.bean.Book;

import java.util.List;

public interface IBookPresenter {
    void getBooks();
    void onBooksSuccess(List<Book> books);
    void onBooksError(String msg);
}
