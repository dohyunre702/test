package com.likelion.final01.controller;

import com.likelion.final01.service.AlgorithmService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/hello")
@RequiredArgsConstructor
public class HelloController {

    private final AlgorithmService algorithmService;

    @GetMapping
    public String hello() {
        return "Hello! 200";
    }

    @GetMapping("/{num}")
    public String sumOfDigit(@PathVariable int num) {
        return algorithmService.sumOfDigit(num);
    }
}
