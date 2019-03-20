//package com.thread;
//
//public class MyThread1 implements Runnable {
//
//	@Override
//	public void run() {
//		while (true){
//			try {
//				Message msg = new Message();
//				msg.setNote("你好啊");
//				Test.msg = msg;
//				new MessageConsumer().print();
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//
//	}
//}
