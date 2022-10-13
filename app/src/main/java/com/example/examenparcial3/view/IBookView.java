package com.example.examenparcial3.view;

import com.example.examenparcial3.bean.Book;

import java.util.List;

public interface IBookView {
    void onBookSuccess(List<Book> books);
    void onBookError(String msg);
}
