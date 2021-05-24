package com.assignment2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebApp {

	private static final Logger logger = LoggerFactory.getLogger(WebApp.class);
    public static void main(String[] args) {
        SpringApplication.run(WebApp.class, args);
    }
}