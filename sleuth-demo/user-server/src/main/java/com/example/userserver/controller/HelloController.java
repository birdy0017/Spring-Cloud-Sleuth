package com.example.userserver.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hi")
    public String home(@RequestParam String name) {
        return "hi "+name+", 来自user-server提供的内容";
    }
}
