package com.restapi.Services;

import com.restapi.Entities.Book;

import java.util.List;

public interface BookService {

    public String storebook(Book book);

    public List<Book> getbook();
}
