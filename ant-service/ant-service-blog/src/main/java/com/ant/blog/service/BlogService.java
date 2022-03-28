package com.ant.blog.service;

import com.ant.entity.Blog;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author LiangKaiXuan
 * @since 2022-03-23
 */
public interface BlogService extends IService<Blog> {
    Blog findById(Long id);
}
