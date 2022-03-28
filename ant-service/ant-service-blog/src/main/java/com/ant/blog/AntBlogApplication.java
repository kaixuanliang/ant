package com.ant.blog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: LiangKaiXuan
 * @Description: 博客服务端启动类
 * @ProjectName: ant
 * @Date: 2022/3/2415:23
 * @Version: V1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.ant.blog.mapper")
public class AntBlogApplication {
    public static void main(String[] args) {
        SpringApplication.run(AntBlogApplication.class, args);
    }
}