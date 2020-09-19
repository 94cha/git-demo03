package com.imooc.tasks;

import java.util.concurrent.Future;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("tasks")
public class DoTask {
	
	@Autowired
    private AsyncTask asyncTask;
	
    @RequestMapping("test1")//测试异步任务-也可以把它塞到定时器任务里面让它定时执行异步任务
    public String test1() throws Exception {
    	
    	long start = System.currentTimeMillis();
    	
    	Future<Boolean> a = asyncTask.doTask11();
    	Future<Boolean> b = asyncTask.doTask22();
    	Future<Boolean> c = asyncTask.doTask33();
    	
    	//那个没完成的，继续完成，知道全部完成。只是为了测试异步任务调用时间是否是最大的那个
    	while (!a.isDone() || !b.isDone() || !c.isDone()) {
    		if (a.isDone() && b.isDone() && c.isDone()) {
    			break;
    		}
    	}
    	
    	long end = System.currentTimeMillis();
    	
    	String times = "任务全部完成，总耗时：" + (end - start) + "毫秒";
    	System.out.println(times);
    	
    	return times;
    }
}
