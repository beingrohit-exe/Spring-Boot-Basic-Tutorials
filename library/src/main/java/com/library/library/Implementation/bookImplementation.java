package com.library.library.Implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.library.Entity.Author;
import com.library.library.Entity.Book;
import com.library.library.Repository.authorRepository;
import com.library.library.Repository.bookRepository;
import com.library.library.Service.bookService;

@Service
public class bookImplementation implements bookService {

    @Autowired
    private bookRepository bookRepository;

    @Autowired
    private authorRepository authorRepository;

    @Override
    public Book createBook(Book book, Long authorId) {
        Author author = authorRepository.findById(authorId).orElseThrow(()-> new RuntimeException("Not Present"));
        book.setAuthor(author);
        Book savedBook = bookRepository.save(book);
        return savedBook;
    }

    @Override
    public Book getById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getById'");
    }

    @Override
    public Book updateBook(Book book, Long bookId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateBook'");
    }

    @Override
    public Book deleteBook(Long bookId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteBook'");
    }

    @Override
    public List<Book> getAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }
    
}
