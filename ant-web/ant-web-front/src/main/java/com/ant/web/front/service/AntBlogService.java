package com.ant.web.front.service;

import com.ant.entity.Blog;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author: LiangKaiXuan
 * @Description: 远程api接口
 * @ProjectName: ant
 * @Date: 2022/3/2415:43
 * @Version: V1.0
 */
@FeignClient("service-blog")
public interface AntBlogService {

    @GetMapping("/blog/findById/{id}")
    Blog findById(@PathVariable("id") Long id);
}
