package com.example.microservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/")
public class DemoController {
    private static final Logger logger = LoggerFactory.getLogger(DemoController.class);
    
    @RequestMapping("hello")
    public String hello() {
        logger.info("Hello SpringBoot!");

        return "Hello SpringBoot!";
    }

}
