package com.bwie.lianxiti5;


public class MyTest5 {
/*	截取某段输出如下，输出“主线程”比“被放弃线程”运行的机会多
	，因为mt线程每次循环都把时间片让给主线程，正是因为yield操作并不会永远放弃CPU，
	仅仅只是放弃了此次时间片，把剩下的时间让给别的线程，*/
	private static Thread mt;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 MyThread mt =new MyThread();

		 mt.start();

		 while(true) {

		 System.out.println("主线程");

		 }
		 
	
	
	
}}

