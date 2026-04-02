package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.example.demo.model.Role;

@RestController
@RequestMapping("/users")

public class UserController {
    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping
    public User createUser(@RequestBody User user) {

        // Role check
        if (user.getRole() != Role.ADMIN) {
            throw new RuntimeException("Only ADMIN can create users");
        }

        return service.createUser(user);
    }

    @GetMapping
    public List<User> getAllUsers() {
        return service.getAllUsers();
    }

}
