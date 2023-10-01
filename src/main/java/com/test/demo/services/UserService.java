package com.test.demo.services;

import com.test.demo.model.User;
import com.test.demo.reposetry.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;
    public Iterable<User> findAll(){
        return userRepo.findAll();
    }
    public User save(User user){
        return (User) userRepo.save(user);
    }
}
