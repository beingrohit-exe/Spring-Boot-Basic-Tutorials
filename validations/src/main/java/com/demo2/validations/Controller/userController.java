package com.demo2.validations.Controller;

import javax.validation.Valid;

import org.hibernate.annotations.SourceType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.demo2.validations.Modal.User;
import com.demo2.validations.Service.userService;

@RestController
@RequestMapping("/user")
public class userController {

    @Autowired
    private userService userService;

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public User createUser(@Valid @RequestBody User user) {
        System.out.println("Entry");
        User createUser = userService.createUser(user);
        return createUser;
    }

    @GetMapping("/{userId}")
    @ResponseStatus(HttpStatus.OK)
    public User getById(@PathVariable Long userId) {
        User user = userService.getById(userId);
        return user;
    }
}
