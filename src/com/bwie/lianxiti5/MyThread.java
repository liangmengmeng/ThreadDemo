package com.bwie.lianxiti5;

public class MyThread extends Thread {
	 

		public void run() {

		while(true) {

		System.out.println("被放弃线程");

		Thread.currentThread().yield();

		}

		}

}
