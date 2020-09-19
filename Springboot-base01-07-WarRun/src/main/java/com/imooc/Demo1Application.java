package com.imooc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/*
//注入application.properties文件配置并且启动项目
//如何创建一个SpringBoot工程  空白处右键new->Spring Start Project -> 创建基本信息 ->选择版本号 -> next ->等他下载 ->删除掉多余文件
@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}

}
*/

/**
 *war部署
 * 修改启动类，继承 SpringBootServletInitializer 并重写 configure 方法

 */

@SpringBootApplication
public class Demo1Application extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {

        // 注意这里要指向原先用main方法执行的Application启动类
        return builder.sources(Demo1Application.class);

    }

}


