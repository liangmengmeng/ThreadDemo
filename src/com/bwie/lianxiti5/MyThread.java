package com.bwie.lianxiti5;

public class MyThread extends Thread {
	 

		public void run() {

		while(true) {

		System.out.println("�������߳�");

		Thread.currentThread().yield();

		}

		}

}
