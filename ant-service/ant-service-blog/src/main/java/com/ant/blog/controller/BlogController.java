package com.ant.blog.controller;

import com.ant.blog.service.BlogService;
import com.ant.entity.Blog;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @Author: LiangKaiXuan
 * @ProjectName: ant
 * @Date: 2022/3/2315:51
 * @Version: V1.0
 */
@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("/blog")
public class BlogController {
    private final BlogService blogService;

    @GetMapping("/findById/{id}")
    public Blog findById(@PathVariable("id")Long id){
        Blog blog = blogService.findById(id);
        return blog;
    }


}