package com.granvilledon.grpicturebackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
@MapperScan("com.granvilledon.grpicturebackend.mapper")
@EnableAspectJAutoProxy(exposeProxy = true)
public class GrPictureApplication {

    public static void main(String[] args) {
        SpringApplication.run(GrPictureApplication.class, args);
    }

}
