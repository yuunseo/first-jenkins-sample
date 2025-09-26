package dev.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Date; // 불필요한 import 또는 미사용 클래스

@RestController
@RequestMapping("/api/hello")
public class HelloController {

    @GetMapping
    public String hello() {
        String responseMessage = "Hello YUNSEO!! The time is: " + new Date().toString();

        return responseMessage;
    }

    @GetMapping(params = "version=2")
    public String hello(int dummyParam) {
        return "Hello YUNSEO, Version 2!";
    }
}