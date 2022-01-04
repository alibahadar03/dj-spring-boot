package com.tgss.dockerspringboot.service;

import com.tgss.dockerspringboot.model.User;
import com.tgss.dockerspringboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user){
        return userRepository.save(user);
    }
    public Iterable<User> findAllUsers(){
        return userRepository.findAll();
    }
    public User findByEmail(String email){
        return userRepository.findByEmail(email).get();
    }
}
