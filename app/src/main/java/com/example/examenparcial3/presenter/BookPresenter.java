package com.example.examenparcial3.presenter;

import com.example.examenparcial3.bean.Book;
import com.example.examenparcial3.model.BookModel;
import com.example.examenparcial3.model.IBookModel;
import com.example.examenparcial3.view.IBookView;

import java.util.List;

public class BookPresenter implements IBookPresenter {

    private IBookView view;
    private IBookModel model;

    public BookPresenter(IBookView hola) {
        this.view = hola;
        this.model = new BookModel(this);
    }

    @Override
    public void getBooks() {
        this.model.getBooks();
    }

    @Override
    public void onBooksSuccess(List<Book> books) {
        if (view == null)
            return;

        this.view.onBookSuccess(books);
    }

    @Override
    public void onBooksError(String msg) {
        if (view == null)
            return;

        this.view.onBookError(msg);
    }
}
