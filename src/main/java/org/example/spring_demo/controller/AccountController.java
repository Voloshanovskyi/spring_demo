package org.example.spring_demo.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
    public String helloSpring(){
        return "Hello Spring!";
    }
}
