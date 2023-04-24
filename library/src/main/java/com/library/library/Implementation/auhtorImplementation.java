package com.library.library.Implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.library.Entity.Author;
import com.library.library.Repository.authorRepository;
import com.library.library.Service.authorService;

@Service
public class auhtorImplementation implements authorService {

    @Autowired
    private authorRepository authorRepository;

    @Override
    public Author createAuthor(Author author) {
        Author savedAuthor =  authorRepository.save(author);
        return savedAuthor;
    }

    @Override
    public Author getById(Long id) {
        Author author = authorRepository.findById(id).orElseThrow(()-> new RuntimeException("Not Present"));
        return author;
    }

    @Override
    public List<Author> getAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }

    @Override
    public Author updateAuthor(Author author, Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateAuthor'");
    }

    @Override
    public String deleteAuthor(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteAuthor'");
    }
    
}
