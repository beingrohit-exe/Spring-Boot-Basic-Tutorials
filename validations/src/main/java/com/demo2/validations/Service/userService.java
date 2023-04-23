package com.demo2.validations.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;

import com.demo2.validations.Exceptions.ApiExecption;
import com.demo2.validations.Modal.User;
import com.demo2.validations.Repository.userRepository;

@Service
public class userService {

    @Autowired
    private userRepository userRepository;
    
    public User createUser(User user){
        System.out.println("Entry Service");
        // User user2 = new User("rohit", "rohit@gmail.com", 20L);
        Long age = user.getAge();

        //Custom Exception
        if(age<18) {
            throw new ApiExecption("Age Should be Greater than 18", false);
        }
        User savedUser = userRepository.save(user);
        return savedUser;
    }

    public User getById(Long userId){
        User user = userRepository.findById(userId).orElseThrow(
            ()-> new ApiExecption("User not found with User Id : " + userId, false));
        return user;
    }
}
