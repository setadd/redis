package com.ffy.spring.example;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ffy.spring.example.test.mapper")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run( Application .class, args);
    }

}