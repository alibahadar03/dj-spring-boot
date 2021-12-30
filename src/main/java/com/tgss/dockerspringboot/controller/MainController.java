package com.tgss.dockerspringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/hi")
    public String hello(){
        return  "Hello my first docker spring boot app";
    }
}
