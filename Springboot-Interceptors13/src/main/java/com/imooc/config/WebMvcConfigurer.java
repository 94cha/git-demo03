package com.imooc.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.imooc.controller.interceptor.OneInterceptor;
import com.imooc.controller.interceptor.TwoInterceptor;

/*
 * Spring boot 拦截器的使用

     使用@Configuration 认为这是一个拦截器，表明是一个适配器

     继承 WebMvcConfigurerAdapter 实现适配器，并重写 addInterceptors

     添加需要的拦截器地址 WebMvcConfigurerAdapter  类 有很多的方法 可以重写 以实现不同的逻辑
   Source->Override/implments Method-> xxx   
 */

@Configuration
public class WebMvcConfigurer extends WebMvcConfigurerAdapter {

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		/**
		 * 拦截器按照顺序执行
		 */
		registry.addInterceptor(new TwoInterceptor()).addPathPatterns("/two/**")
													 .addPathPatterns("/one/**");
		registry.addInterceptor(new OneInterceptor()).addPathPatterns("/one/**");
		
		super.addInterceptors(registry);
	}

}
