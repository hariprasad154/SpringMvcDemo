package com.bridgelabs.MvcPractice.controller;

import com.bridgelabs.MvcPractice.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class MyController {
    @GetMapping(value = "/greeting")
    public String greeting(){
        return "greeting";
    }
    @PostMapping(value = "/login")
    public String login(@RequestBody User user){
        return "login";
    }
}
