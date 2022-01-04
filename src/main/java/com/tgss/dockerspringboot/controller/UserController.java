package com.tgss.dockerspringboot.controller;

import com.tgss.dockerspringboot.model.User;
import com.tgss.dockerspringboot.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user/v1")
public class UserController {

    @Autowired
   private UserServiceImpl userService;
    @GetMapping("/hi")
    public String hello(){
        return  "Hello my first docker spring boot app on jenkins";
    }

    @PostMapping("/add")
    public ResponseEntity<?> saveUser(@RequestBody User user){
        return new ResponseEntity<>(userService.saveUser(user), HttpStatus.OK);
    }
    @GetMapping("/findAll")
    public ResponseEntity<?> findAllUser(){
        return new ResponseEntity<>(userService.findAllUsers(),HttpStatus.OK);
    }
    @GetMapping("/findByEmail/{email}")
    public ResponseEntity<?> findByEmail(@PathVariable("email") String email){
        return new ResponseEntity<>(userService.findByEmail(email),HttpStatus.OK);
    }
}
