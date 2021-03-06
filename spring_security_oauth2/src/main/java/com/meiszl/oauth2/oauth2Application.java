package com.meiszl.oauth2;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.meiszl.oauth2.Mapper")
public class oauth2Application {
    public static void main(String[] args) {
        SpringApplication.run(oauth2Application.class,args);
    }
}
