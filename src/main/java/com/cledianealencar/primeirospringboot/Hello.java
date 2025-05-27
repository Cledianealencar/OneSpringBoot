package com.cledianealencar.primeirospringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @GetMapping("/api")
    public String hello() {
        return "Hello, Spring Boot!";
    }

}
