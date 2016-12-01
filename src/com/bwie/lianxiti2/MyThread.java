package com.bwie.lianxiti2;

public class MyThread implements Runnable{
	private int ticket =10;  
    private String name; 

	@Override
	public void run() {
	        for(int i =0;i<500;i++){  
	            if(this.ticket>0){  
	                System.out.println(Thread.currentThread().getName()+"ÂôÆ±---->"+(this.ticket--));  
	        }  
	    }  
	}		
	

}
