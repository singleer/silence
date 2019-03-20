package com.thread;

public class IntLockTest {
	public static void main(String[] args) throws InterruptedException {
		/**
		 * 这部分代码主要是针对 lockInterruptibly 方法，该方法在线程发生死锁的时候可以中断线程。让线程放弃锁。
		 * 而 synchronized 是没有这个功能的， 他要么获得锁继续执行，要么继续等待锁。
		 */

		IntLock r1 = new IntLock(1);
		IntLock r2 = new IntLock(2);
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
		Thread.sleep(5000);
		// 中断其中一个线程（只有线程在等待锁的过程中才有效）
		// 如果线程已经拿到了锁，中断是不起任何作用的。
		// 注意：这点 synchronized 是不能实现此功能的，synchronized 在等待过程中无法中断
		t2.interrupt();
		// t2 线程中断，抛出异常，并放开锁。没有完成任务
		// t1 顺利完成任务。
	}
}
