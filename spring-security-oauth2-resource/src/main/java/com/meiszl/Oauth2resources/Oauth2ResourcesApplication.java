package com.meiszl.Oauth2resources;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.meiszl.Oauth2resources.Mapper")
public class Oauth2ResourcesApplication {

    public static void main(String[] args) {
        SpringApplication.run(Oauth2ResourcesApplication.class,args);
    }
}
