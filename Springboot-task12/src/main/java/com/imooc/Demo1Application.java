package com.imooc;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

//注意import org.mybatis.spring.annotation.MapperScan;会报错
//org.mybatis.spring.MyBatisSystemException: nested exception is org.apache.ibatis.builder.BuilderException
import tk.mybatis.spring.annotation.MapperScan;



@SpringBootApplication
//扫描 mybatis mapper 包路径
@MapperScan(basePackages = "com.imooc.mapper")
//扫描 所有需要的包, 包含一些自用的工具类包 所在的路径
@ComponentScan(basePackages= {"com.imooc", "org.n3r.idworker"})
//开启定时器任务，-相应的任务类中定义@Component
@EnableScheduling
/*开启异步调用方法：
 * 	相应的任务类中定义@Component @Async作为组件被容器扫描执行
  *    使用场景：①发送短息 ②发送邮件  ③APP消息推送  ④节省运维凌晨发布任务时间提高效率
 */
@EnableAsync
public class Demo1Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}

}
