package com.likelion.final01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/hello")
public class HelloController {

    @GetMapping
    public String hello() {
        return "Hello! 200";
    }

    @GetMapping("{num}")
    public Integer sumOfDigit(@RequestParam("num") Integer num) {
        int sum = 0;
        while (num > 0) {
          sum +=  num % 10;
          num /= 10;
        }
        return sum;
    }

}
