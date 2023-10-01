package com.test.demo.controller;

import com.test.demo.model.Departement;
import com.test.demo.model.User;
import com.test.demo.services.DeptService;
import com.test.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping()
    public Iterable<User> findAll(){
        return userService.findAll();
    }
    @PostMapping()
    public User save(User user){
        return userService.save(user);
    }
}
