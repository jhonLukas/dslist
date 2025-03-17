package com.joaoL.estudo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping 
    public String helloWorld(){
        return "Hello World";
    }
}
