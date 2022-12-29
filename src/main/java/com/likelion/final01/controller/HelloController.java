package com.likelion.final01.controller;

import com.likelion.final01.service.AlgorithmService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/hello")
@RequiredArgsConstructor
public class HelloController {

    private final AlgorithmService algorithmService;

    @GetMapping
    public String hello() {
        return "Hello! 200";
    }

    @GetMapping("{num}")
    public int sumOfDigit(@RequestParam("num") int num) {
        return algorithmService.sumOfDigit(num);
    }

}
