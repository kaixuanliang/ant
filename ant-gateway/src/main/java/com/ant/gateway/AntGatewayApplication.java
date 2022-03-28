package com.ant.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: LiangKaiXuan
 * @Description: 网关启动类
 * @ProjectName: ant
 * @Date: 2022/3/2513:47
 * @Version: V1.0
 */
@EnableDiscoveryClient
@SpringBootApplication
public class AntGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(AntGatewayApplication.class, args);
    }
}