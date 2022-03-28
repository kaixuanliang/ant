package com.ant.blog.service.impl;

import com.ant.blog.mapper.BlogMapper;
import com.ant.blog.service.BlogService;
import com.ant.entity.Blog;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author LiangKaiXuan
 * @since 2022-03-23
 */
@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {
    public Blog findById(Long id) {
        Blog blog = this.getById(id);
        return blog;
    }
}
