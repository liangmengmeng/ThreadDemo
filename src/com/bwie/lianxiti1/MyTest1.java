package com.bwie.lianxiti1;

public class MyTest1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyThread mt1= new MyThread("一号窗口");  
        MyThread mt2= new MyThread("二号窗口");  
        MyThread mt3= new MyThread("三号窗口");  
        mt1.start();  
        mt2.start();  
        mt3.start();
	}

}
