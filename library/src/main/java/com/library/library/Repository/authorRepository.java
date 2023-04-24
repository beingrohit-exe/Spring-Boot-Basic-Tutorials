package com.library.library.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.library.library.Entity.Author;

public interface authorRepository extends JpaRepository<Author, Long> {
    
}
