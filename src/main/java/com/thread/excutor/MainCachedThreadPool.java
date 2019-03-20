package com.thread.excutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainCachedThreadPool {

	public static void main(String[] args){
		//创建Runnable对象，实现run()方法
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + " running!");
				try {
					//为了体现出任务竞争资源，让线程休眠1000ms
					Thread.sleep(1000L);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + " end!");
			}
		};
		//创建线程池，加入任务，执行任务
		ExecutorService myThreadPool = Executors.newCachedThreadPool();
		myThreadPool.execute(runnable);
		myThreadPool.execute(runnable);
		myThreadPool.execute(runnable);
		myThreadPool.execute(runnable);
		myThreadPool.execute(runnable);
		//关闭线程池
		myThreadPool.shutdown();
	}

}
