package com.neuedu.part10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

/**
 * ����
 * �����Ǳ䳤�ģ�ֻ�ܷ������������͵� ���ݼ�(���ԷŲ�ͬ����)
 * List����
 * ArrayList:���Խṹ���ײ��Ǹ����飬Ĭ�ϳ�����10
 * ע�⣺���ϲ���ָ��������ǰsize-1��λ�ý��и�ֵ
 * ��ȡ���� ����size()����
 * �������add()
 * ��ȡ����get(index)
 * addAll ����һ�����ϵ�����Ԫ����ӽ���
 * clear ��ռ�������
 * remove ָ��λ��ɾ��
 * isEmpty �жϼ����Ƿ���Ԫ��
 * 
 * ������
 * �̳���collection �ӿڵļ����඼���ڵķ���
 * ͨ����Ӧ�������õ���iterator()���� ����һ������������
 * ����������ķ���
 * hasNext() �ж���û����һ��Ԫ��
 * next() ������һ��Ԫ�أ����ƶ�Ԫ���ж�λ��
 * 
 * LinkedList �ڲ����ݴ洢�ṹ��ArrayList
 * ��һ��������������β���ݽ��д���
 * addFirst�������ײ���������
 * addLast������β����������
 * 
 * ArrayList��LinkedList������
 * �ṹ��ͬ
 * Ƶ��������������ʱ���в�ѯ�����϶�ʱ������ʹ��ArryList
 * �����ݲ������ɾ�������϶�ʱ������ʹ��LinkedList
 * 
 * List�����ص�  ���� �����ظ�
 * 
 * Set���� �ص� ���� �����ظ�
 * HashSet ����ȥ���ظ�
 * ��ν�������ǺͲ�������˳���޹�
 * 
 * TreeSet������������ԣ�
 * �ڲ���������
 */
public class Test10012001 {

	public static void main(String[] args) {

		ArrayList arrayList = new ArrayList();//�ײ���Ǹ�����
		//��ֵ
		arrayList.add(new Integer(1));
		
		arrayList.add(2);//����֧���Զ�װ��Ͳ���
		
		arrayList.add("string");
		
		System.out.println(arrayList.get(1));
		
		ArrayList arrayList2 = new ArrayList();
		
		arrayList2.add(10);
		
		arrayList2.addAll(arrayList);
		
		arrayList2.clear();//�������
		
		//arrayList2.remove(0);
		System.out.println(arrayList2.isEmpty());
		
		//���ϳ���
		int size = arrayList.size();
		System.out.println(arrayList.toString());
		System.out.println(arrayList2);
		
		//���ϵı���
		for(int i=0;i<arrayList.size();i++){
			System.out.println(arrayList.get(i));
		}
		
		Iterator iterator = arrayList.iterator();//��ȡһ����ǰ���ϵĵ���������
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		//����ѧ����Ϣ name��score��age  ����exit�˳�������ڼ����У���ȡƽ����
		//int score = avgScore();
		LinkedList linkedList = new LinkedList();
		
		linkedList.add(10);
		linkedList.get(0);
		
		linkedList.addFirst(10);
		linkedList.addLast(10);
		linkedList.removeFirst();
		linkedList.removeLast();
		
		Stack stack = new Stack();
		
	/*	stack.pop();
		
		stack.peek();*/
		
		HashSet hashSet = new HashSet();
		
		hashSet.add(10);
		hashSet.add("aa");
		hashSet.add("qqq");
		hashSet.add(-1);
		System.out.println(hashSet);
	}

	private static int avgScore() {
		ArrayList  stu = new ArrayList();
		while (true) {
			Student student = new  Student();
			Scanner scanner = new Scanner(System.in);
			System.out.println("������ѧ������");
			String name = scanner.nextLine();
			student.setName(name);
			System.out.println("������ѧ������");
			int score = scanner.nextInt();
			student.setScore(score);
			System.out.println("������ѧ������");
			int age = scanner.nextInt();
			student.setAge(age);
			stu.add(student);
			System.out.println("�Ƿ����¼��ѧ����Ϣ�������������exit");
			Scanner sc = new Scanner(System.in);
			String info = sc.nextLine();
			if("exit".equals(info)){
				break;
			}
		}
		int sum=0;
		Iterator iterator2 = stu.iterator();
		while (iterator2.hasNext()) {
			Student next = (Student) iterator2.next();
			sum+=next.getScore();
		}
		return sum/stu.size();
	}
	

}

class Student{
	
	private String name;
	
	private int score;
	
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}

