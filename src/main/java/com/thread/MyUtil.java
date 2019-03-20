package com.thread;

public class MyUtil {
	public static ThreadLocal<Message> threadlocal = new ThreadLocal<>();
	public static void set(Message msg){
		threadlocal.set(msg);
	}
	public static Message get(){
		return threadlocal.get();
	}
}
