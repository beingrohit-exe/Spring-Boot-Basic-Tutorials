package com.library.library.Service;

import java.util.List;

import com.library.library.Entity.Book;

public interface bookService {
    Book createBook(Book book, Long authorId);
    Book getById(Long id);
    Book updateBook(Book book, Long bookId);
    Book deleteBook(Long bookId);
    List<Book> getAll();
}
