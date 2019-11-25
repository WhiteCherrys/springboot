package com.example.test;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;

@SpringBootTest
@SpringBootApplication
@ComponentScan("com.example.test.dao")
@MapperScan("com.example.test.dao")
class TestApplicationTests {

    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }

}
