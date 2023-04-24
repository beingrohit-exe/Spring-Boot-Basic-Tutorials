package com.library.library.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.library.library.Entity.Book;
import com.library.library.Service.bookService;

@RestController
@RequestMapping("/book")
public class bookController {
    
    @Autowired
    private bookService bookService;

    @PostMapping("/{authorId}")
    @ResponseStatus(HttpStatus.OK)
    public Book createBook(@RequestBody Book book, @PathVariable Long authorId){
        Book createdBook = bookService.createBook(book, authorId);
        return createdBook;
    }
}
