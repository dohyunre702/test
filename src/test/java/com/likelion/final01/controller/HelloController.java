package com.likelion.final01.controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest
public class HelloController {

    @Autowired
    MockMvc mockMvc;

    @Test
    @DisplayName("sumofdigit")
    int sumOfDigitTest() throws Exception {
        
    }
}
