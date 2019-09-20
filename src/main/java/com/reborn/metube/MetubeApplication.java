package com.reborn.metube;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.reborn.metube.mapper")
public class MetubeApplication {
    public static void main(String[] args) {
        SpringApplication.run(MetubeApplication.class, args);
    }

}