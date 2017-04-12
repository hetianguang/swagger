package com.example.demo.main;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication(
        scanBasePackages = {
                "com.example.demo", "com.example.demo.main"
        })
public class SampleJerseyApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        new SampleJerseyApplication()
                .configure(new SpringApplicationBuilder(SampleJerseyApplication.class))
                .run(args);

    }
}