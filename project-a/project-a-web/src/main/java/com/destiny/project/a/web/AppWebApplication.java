package com.destiny.project.a.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(scanBasePackages = {"com.destiny.project.a"})
//扫描Mapper接口文件
@MapperScan(basePackages = "com.destiny.**.mapper")
//注册nacos微服务
@EnableDiscoveryClient
public class AppWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(AppWebApplication.class, args);
    }
}
