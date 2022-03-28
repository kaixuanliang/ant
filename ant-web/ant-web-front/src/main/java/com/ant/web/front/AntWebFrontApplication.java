package com.ant.web.front;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author: LiangKaiXuan
 * @Description: ant资源小站前端用户系统启动类
 * @ProjectName: ant
 * @Date: 2022/3/2415:30
 * @Version: V1.0
 */
@EnableFeignClients
@SpringBootApplication
@EnableDiscoveryClient
public class AntWebFrontApplication {
    public static void main(String[] args) {
        SpringApplication.run(AntWebFrontApplication.class, args);
    }
}