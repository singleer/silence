package com.thread.march;

/**
 * 两线程奇偶数打印
 */
public class NumberThread {

	/*public static void main(String[] args) {

		Thread oddThread = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 1; i <= 100; i++){
					if (i%2 !=0){
						System.out.println("奇线程:" + i);
					}
				}
			}
		});

		Thread evenThread = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i <= 100; i++){
					if (i%2 ==0){
						System.out.println("偶线程:" + i);
					}
				}
			}
		});
		oddThread.start();
		evenThread.start();

	}*/

	static class SolutionTask implements Runnable{
		static int value = 0;
		@Override
		public void run() {
			while (value <= 100){
				synchronized (SolutionTask.class){
					System.out.println(Thread.currentThread().getName() + ":" + value++);
					SolutionTask.class.notify();
					try {
						SolutionTask.class.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
	public static void main(String[] args) {
		new Thread(new SolutionTask(), "偶数").start();
		new Thread(new SolutionTask(), "奇数").start();
	}
}
