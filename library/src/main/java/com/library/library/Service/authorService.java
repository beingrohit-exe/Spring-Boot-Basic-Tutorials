package com.library.library.Service;

import java.util.List;

import com.library.library.Entity.Author;

public interface authorService {
    
    public Author createAuthor(Author author);

    public Author getById(Long id);

    public List<Author> getAll();

    public Author updateAuthor(Author author, Long id);

    String deleteAuthor(Long id);
}
