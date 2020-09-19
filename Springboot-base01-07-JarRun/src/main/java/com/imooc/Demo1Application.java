package com.imooc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//注入application.properties文件配置并且启动项目
//如何创建一个SpringBoot工程  空白处右键new->Spring Start Project -> 创建基本信息 ->选择版本号 -> next ->等他下载 ->删除掉多余文件
@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}

}
