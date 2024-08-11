package com.journal.journal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Example1 {

    @GetMapping("hi")
    public String hello(String name){
        return "hi "+name;
    }

}