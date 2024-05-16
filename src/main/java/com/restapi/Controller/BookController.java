package com.restapi.Controller;

import com.restapi.Entities.Book;
import com.restapi.Services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookService service;
    @PostMapping("/book")
    public ResponseEntity<Book> createbook(@RequestBody Book book)
    {
        String storebook = service.storebook(book);

        return  new ResponseEntity(storebook, HttpStatus.CREATED);
    }

    @GetMapping("/get")
    public ResponseEntity<String> getAllBook(){
        List<Book> getbook = service.getbook();

        return new ResponseEntity(getbook,HttpStatus.OK);
    }
}
