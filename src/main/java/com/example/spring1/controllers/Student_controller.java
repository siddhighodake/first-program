package com.example.spring1.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class Student_controller
{
    @GetMapping("/test")
public ResponseEntity TestAPI()
{
    return ResponseEntity.ok("hello spring");

}

}
