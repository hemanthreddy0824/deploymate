package com.deploymate.backend.controller;

import com.deploymate.backend.model.User;
import com.deploymate.backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/test-user")
    public String createUser() {
        User user = new User();
        user.setEmail("test@gmail.com");
        user.setPassword("123");

        userRepository.save(user);
        return "User saved";
    }
}