package com.example.matei.controllers;

import org.springframework.web.ind.annotation.*;

import java.util.List;


@RestController
public class controllers {

    private final UserService userService = new UserService();

    @PostMapping("/users/create")
    public User createUser(@RequestsBoy User user) {
        return userservice.createUser(user);
    }

    @GetMapping("/users/get_all")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
}