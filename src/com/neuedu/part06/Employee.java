package com.neuedu.part06;


/**
 * ������
 * 
 *
 */

public class Employee {
	
	//��д����
	//
	String name;
	int age;
	double sal;
	
	//д��Ϊ��������
	//��ȡ����
	public String showName(){
		System.out.println("Ա������Ϊ��"+name);
		return name;
	}
	
	/**
	 * ��ȡ�꼶
	 * @param Ϊ��
	 * @return age ���
	 */
	
	public int sgowAge(){
		System.out.println("Ա�����Ϊ��"+age);
		return age;
	}
	
	/**
	 * �޸�����
	 * @param _name Ԥ���޸ĵ�����
	 */
	
	public void updateName(String _name){
		name = _name;
	}
	
	/**
	 * ��ȡ����
	 * @return sal
	 */
	
	public double getSal(){
		System.out.println("The sal of this month is "+sal);
		return sal;
	}

	public char[] showAge() {
		// TODO Auto-generated method stub
		return null;
	}
		

}
