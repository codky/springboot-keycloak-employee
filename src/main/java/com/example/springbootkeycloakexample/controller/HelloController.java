package com.example.springbootkeycloakexample.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(Model model, Authentication auth) {
        return "hello";
    }
}
