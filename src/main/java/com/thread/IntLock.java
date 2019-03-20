package com.thread;

import java.util.concurrent.locks.ReentrantLock;

public class IntLock implements Runnable {

	/**
	 * 默认是不公平的锁，设置为 true 为公平锁
	 *
	 * 公平：在多个线程的争用下，这些锁倾向于将访问权授予等待时间最长的线程；
	 * 使用公平锁的程序在许多线程访问时表现为很低的总体吞吐量（即速度很慢，常常极其慢）
	 * 还要注意的是，未定时的 tryLock 方法并没有使用公平设置
	 *
	 * 不公平：此锁将无法保证任何特定访问顺序
	 *
	 * 拾遗：1 该类的序列化与内置锁的行为方式相同：一个反序列化的锁处于解除锁定状态，不管它被序列化时的状态是怎样的。
	 *      2.此锁最多支持同一个线程发起的 2147483648 个递归锁。试图超过此限制会导致由锁方法抛出的 Error。
	 */
	static ReentrantLock lock1 = new ReentrantLock(true);
	static ReentrantLock lock2 = new ReentrantLock();
	int lock;

	/**
	 * 控制加锁顺序，方便制造死锁
	 * @param lock
	 */
	public IntLock(int lock) {
		this.lock = lock;
	}

	/**
	 * lockInterruptibly 方法： 获得锁，但优先响应中断
	 * tryLock 尝试获得锁，不等待
	 * tryLock(long time , TimeUnit unit) 尝试获得锁，等待给定的时间
	 */
	@Override
	public void run() {
		try {
			if (lock == 1) {
				// 如果当前线程未被中断，则获取锁。
				lock1.lockInterruptibly();// 即在等待锁的过程中，可以响应中断。
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				// 试图获取 lock 2 的锁
				lock2.lockInterruptibly();
			} else {

				lock2.lockInterruptibly();
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				// 该线程在企图获取 lock1 的时候，会死锁，但被调用了 thread.interrupt 方法，导致中断。中断会放弃锁。
				lock1.lockInterruptibly();
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			if (lock1.isHeldByCurrentThread()) {
				lock1.unlock();
			}

			// 查询当前线程是否保持此锁。
			if (lock2.isHeldByCurrentThread()) {
				lock2.unlock();
			}

			System.out.println(Thread.currentThread().getName() + ": 线程退出");
		}
	}
}
