package com.nisha.aiintervi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.nisha.aiintervi.model.User;
import com.nisha.aiintervi.repository.UserRepository;


@RestController
@CrossOrigin
public class AuthController {

    @Autowired
    private UserRepository repo;

    @PostMapping("/register")
    public String register(@RequestBody User user) {
        repo.save(user);
        return "User Registered Successfully";
    }

    @PostMapping("/login")
    public User login(@RequestBody User user) {
        return repo.findByEmailAndPassword(user.getEmail(), user.getPassword());
    }
}