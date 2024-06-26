package com.itheima.book;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@MapperScan("com.itheima.book.mapper")
@EnableCaching
public class BookManagementServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(BookManagementServerApplication.class, args);
    }
}
