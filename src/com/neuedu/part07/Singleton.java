package com.neuedu.part07;

import java.util.Date;

public class Singleton {
	
	//1.构造方法有化
	private Singleton(){
		
	}
	
	private static Singleton instance = new Singleton();//饿汉式
	
	public static Singleton getInstance(){
		if(instance ==null){//懒汉式
			instance = new Singleton();
		}
		return instance;
	}
	
	public Date getDate(){
		return new Date();
	}
	

}
