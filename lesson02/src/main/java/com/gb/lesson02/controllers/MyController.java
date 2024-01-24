package com.gb.lesson02.controllers;

import com.gb.lesson02.services.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MyController {

    private final MyService myService;

    @Autowired
    public MyController(MyService myService){
        this.myService = myService;
    }

    @GetMapping
    public String hello(){
        return this.myService.getGreeting();
    }
}
