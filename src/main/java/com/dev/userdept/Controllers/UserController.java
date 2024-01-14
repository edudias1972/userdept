package com.dev.userdept.Controllers;

import com.dev.userdept.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.dev.userdept.entities.User;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<User> findAll() {
        List<User> result = userRepository.findAll();
        return result;
    }

    @GetMapping(value="{id}")
    public User findById(@PathVariable Long id) {
        User result = userRepository.findById(id).get();
        return result;
    }

    @PostMapping
    public User isert(@RequestBody User user) {
        User result = userRepository.save(user);
        return result;
    }
}
