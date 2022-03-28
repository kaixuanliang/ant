package com.ant.web.front.config;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: LiangKaiXuan
 * @Description: 添加与WebMvc相关的自定义配置
 * @ProjectName: ant
 * @Date: 2022/3/2510:38
 * @Version: V1.0
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    /**
     * fastjson日期格式化
     * @param converters
     */
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        FastJsonHttpMessageConverter fastJsonConverter = new FastJsonHttpMessageConverter();
        FastJsonConfig fastJsonConfig = new FastJsonConfig();
        fastJsonConfig.setSerializerFeatures(SerializerFeature.WriteDateUseDateFormat);
        fastJsonConverter.setFastJsonConfig(fastJsonConfig);
        //要显示指明将fastJsonConverter排在消息转换器管道列表的首位
        converters.add(0, fastJsonConverter);
    }

}