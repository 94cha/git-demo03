package com.imooc.tasks;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Future;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TestTask {

	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
    
	@Autowired
    private AsyncTask asyncTask;
	
	// 定义每过30秒执行异步任务
    @Scheduled(fixedRate = 30000)
    public void reportCurrentTime() throws Exception{
	  
		long start = System.currentTimeMillis();
	  	Future<Boolean> a = asyncTask.doTask11();
	  	Future<Boolean> b = asyncTask.doTask22();
	  	Future<Boolean> c = asyncTask.doTask33();
	  	
	  	//哪个没完成的，继续完成，直到全部完成。只是为了测试异步任务调用时间是否是最大的那个
	  	while (!a.isDone() || !b.isDone() || !c.isDone()) {
	  		if (a.isDone() && b.isDone() && c.isDone()) {
	  			break;
	  		}
	  	}
	  	
	  	long end = System.currentTimeMillis();
	  	
	  	String times = "任务全部完成，总耗时：" + (end - start) + "毫秒";
	  	System.out.println(times);
	  
    }
}
