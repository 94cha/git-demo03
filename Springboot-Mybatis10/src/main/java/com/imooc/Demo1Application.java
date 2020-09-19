package com.imooc;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
//注意import org.mybatis.spring.annotation.MapperScan;会报错
//org.mybatis.spring.MyBatisSystemException: nested exception is org.apache.ibatis.builder.BuilderException
import tk.mybatis.spring.annotation.MapperScan;



@SpringBootApplication
//扫描 mybatis mapper 包路径
@MapperScan(basePackages = "com.imooc.mapper")
//扫描 所有需要的包, 包含一些自用的工具类包 所在的路径
@ComponentScan(basePackages= {"com.imooc", "org.n3r.idworker"})


public class Demo1Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}

}
