package com.library.library.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.library.library.Entity.Book;

public interface bookRepository extends JpaRepository<Book, Long> {
    
}
