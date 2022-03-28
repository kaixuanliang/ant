package com.ant.web.front.service;

import com.ant.entity.Blog;

/**
 * @Author: LiangKaiXuan
 * @Description: API接口
 * @ProjectName: ant
 * @Date: 2022/3/2415:43
 * @Version: V1.0
 */
public interface AntWebBlogService {
    Blog findById(Long id);
}
