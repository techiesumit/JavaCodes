package com.sumit.example.strategy.service;

import com.sumit.example.strategy.service.model.Book;

import java.util.Collections;
import java.util.List;

public class MySQLBookService implements BookService {
    @Override
    public void addBook(Book book) {
        System.out.println("Addng Book in SQL DB");
    }

    @Override
    public void updateBook(Book book) {
        System.out.println("Updating Book in SQL");

    }

    @Override
    public List<Book> getBookById(String bookId) {
        return Collections.emptyList();
    }
}
