package com.bwie.lianxiti2;

public class MyTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//��������߳�
		MyThread mt=new MyThread();
		Thread t1 = new Thread(mt,"һ�Ŵ���");  
        Thread t2 = new Thread(mt,"���Ŵ���");  
        Thread t3 = new Thread(mt,"���Ŵ���");  
        t1.start();
        t2.start();
        t3.start();
		
	}
}
