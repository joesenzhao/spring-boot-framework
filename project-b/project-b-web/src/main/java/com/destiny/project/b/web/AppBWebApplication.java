package com.destiny.project.b.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.destiny"})
//扫描Mapper接口文件
@MapperScan(basePackages = "com.destiny.**.mapper")
public class AppBWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(AppBWebApplication.class, args);
    }
}
