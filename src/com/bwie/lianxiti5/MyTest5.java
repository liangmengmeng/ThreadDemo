package com.bwie.lianxiti5;


public class MyTest5 {
/*	��ȡĳ��������£���������̡߳��ȡ��������̡߳����еĻ����
	����Ϊmt�߳�ÿ��ѭ������ʱ��Ƭ�ø����̣߳�������Ϊyield������������Զ����CPU��
	����ֻ�Ƿ����˴˴�ʱ��Ƭ����ʣ�µ�ʱ���ø�����̣߳�*/
	private static Thread mt;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 MyThread mt =new MyThread();

		 mt.start();

		 while(true) {

		 System.out.println("���߳�");

		 }
		 
	
	
	
}}

