package com.bwie.lianxiti2;

public class MyTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//设计三个线程
		MyThread mt=new MyThread();
		Thread t1 = new Thread(mt,"一号窗口");  
        Thread t2 = new Thread(mt,"二号窗口");  
        Thread t3 = new Thread(mt,"三号窗口");  
        t1.start();
        t2.start();
        t3.start();
		
	}
}
