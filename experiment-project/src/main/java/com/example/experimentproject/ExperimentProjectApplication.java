package com.example.experimentproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class ExperimentProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExperimentProjectApplication.class, args);
        System.out.println("运行成功");
    }

}
