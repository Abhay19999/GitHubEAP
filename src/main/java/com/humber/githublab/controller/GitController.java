package com.humber.githublab.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitController {
@GetMapping("/")
    public String UpdateByAbhay(){
    return "Hello from Abhay Github";
}
}
