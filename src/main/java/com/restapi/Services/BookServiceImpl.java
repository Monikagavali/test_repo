package com.restapi.Services;

import com.restapi.Entities.Book;
import com.restapi.Repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository repository;

    @Override
    public String storebook(Book book) {
        Book booksave = repository.save(book);
        return "Book has saved";
    }

    @Override
    public List<Book> getbook() {
        List<Book> findall = repository.findAll();
        return findall;
    }
}
