package com.example.jenkins_docker_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TestController {

    @GetMapping("/write/{name}")
    public String getString(@PathVariable String name) {
        return "Running from Jenkins via Docker Image "+name;
    }
}
