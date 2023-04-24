package com.library.library.Controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.library.library.Entity.Author;
import com.library.library.Service.authorService;

@RestController
@RequestMapping("/author")
public class authorController {

    @Autowired
    private authorService authorService;
    
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Author createAuthor(@Valid @RequestBody Author author){
        Author savedAuthor =  authorService.createAuthor(author);
        return savedAuthor;
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Author getById(@PathVariable Long id){
        Author byId = authorService.getById(id);
        return byId;
    }
}
