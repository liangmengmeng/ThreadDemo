package com.bwie.lianxiti1;

public class MyTest1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyThread mt1= new MyThread("һ�Ŵ���");  
        MyThread mt2= new MyThread("���Ŵ���");  
        MyThread mt3= new MyThread("���Ŵ���");  
        mt1.start();  
        mt2.start();  
        mt3.start();
	}

}
