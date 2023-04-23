package com.demo2.validations.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo2.validations.Modal.User;

public interface userRepository extends JpaRepository<User, Long> {
    
}
