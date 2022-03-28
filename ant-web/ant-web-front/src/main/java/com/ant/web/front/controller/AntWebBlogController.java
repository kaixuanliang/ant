package com.ant.web.front.controller;

import com.alibaba.fastjson.JSON;
import com.ant.entity.Blog;
import com.ant.web.front.service.AntWebBlogService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: LiangKaiXuan
 * @Description: 前端接口
 * @ProjectName: ant
 * @Date: 2022/3/2415:41
 * @Version: V1.0
 */
@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("/web-front/blog")
public class AntWebBlogController {
    private AntWebBlogService antWebBlogService;

    @GetMapping("/findById/{id}")
    public Blog findById(@PathVariable("id") Long id) {
        Blog blog = antWebBlogService.findById(id);

        return blog;
    }

}