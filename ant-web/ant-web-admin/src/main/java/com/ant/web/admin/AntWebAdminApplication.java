package com.ant.web.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author: LiangKaiXuan
 * @Description: ant资源小站后台管理系统启动类
 * @ProjectName: ant
 * @Date: 2022/3/259:56
 * @Version: V1.0
 */
@EnableFeignClients
@SpringBootApplication
@EnableDiscoveryClient
public class AntWebAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(AntWebAdminApplication.class, args);
    }
}