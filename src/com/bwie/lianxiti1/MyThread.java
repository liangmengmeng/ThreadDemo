package com.bwie.lianxiti1;

public class MyThread extends Thread{
	private int ticket = 10;  
    private String name;  
    public MyThread(String name){  
        this.name =name;  
    }  
      
    public void run(){  
        for(int i =0;i<500;i++){  
            if(this.ticket>0){  
                System.out.println(this.name+"��Ʊ---->"+(this.ticket--));  
            }  
        }  
    }  
}
