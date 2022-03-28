package com.ant.web.front.service.impl;

import com.ant.entity.Blog;
import com.ant.web.front.service.AntBlogService;
import com.ant.web.front.service.AntWebBlogService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @Author: LiangKaiXuan
 * @Description: 接口实现类
 * @ProjectName: ant
 * @Date: 2022/3/2415:43
 * @Version: V1.0
 */
@Slf4j
@Service
@AllArgsConstructor
public class AntWebBlogServiceImpl implements AntWebBlogService {
    private final AntBlogService antBlogService;

    public Blog findById(Long id) {
        Blog blog = antBlogService.findById(id);
        return blog;
    }
}