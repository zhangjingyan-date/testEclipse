package com.neuedu.part10;

import java.util.LinkedList;

public class Test10012103 {
	
	public static void main(String[] args) {
		/*
		 * 
		 * 1.��ʹ��LinkedList��ģ��һ�����У��Ƚ��ȳ������ԣ���
		 * 
		 * 1.1 ӵ�з������ķ���void put(object o)
		 * 
		 * 1.2 ȡ������ķ���Object get()
		 * 
		 * 1.3 �ж϶��е����Ƿ�Ϊ�յķ���boolean isEmpty(),���ң���д���Դ��룬��֤��Ķ����Ƿ���ȷ
		 */
		
		MyQueue<String> myQueue = new MyQueue<>();
		
		myQueue.put("1");
		myQueue.put("2");
		myQueue.put("3");
		myQueue.put("4");
		
		while(!myQueue.isEmpty()){
			System.out.println(myQueue.get());
			
		}
	}

}

class MyQueue<T> {
	
	LinkedList<T> list;
	
	public int size;
	
	public MyQueue(){
		
		list = new LinkedList<>();
	}
	
	public void put(T t){
		size++;
		list.addLast(t);
	}
	
	public T get(){
		T first = list.getFirst();
		list.removeFirst();
		return first;
	}
	
	public boolean isEmpty(){
		
		return list.isEmpty();
	}
	
	public int size() {
		
		return size;
	}
}
