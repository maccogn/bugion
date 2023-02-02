package com.bugion.Bugion.controller;

import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    public ResponseEntity<HelloBugion> getHello(){
        return new ResponseEntity<>(new HelloBugion(), HttpStatus.OK);
    }

    @Data
    class HelloBugion{
        String message = "Hello Bugion!";
    }
}
