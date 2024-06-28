package com.itheima.book;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.itheima.book.mapper")
@EnableCaching
@EnableScheduling
public class BookManagementServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(BookManagementServerApplication.class, args);
    }
}
