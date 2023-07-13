package com.programming.techie.pkce.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/home")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class HomeRestController {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public String home() {
        return "Hello";
    }
}
