package com.neuedu.part06;


/**
 * 打工人类
 * 
 *
 */

public class Employee {
	
	//先写属性
	//
	String name;
	int age;
	double sal;
	
	//写行为（方法）
	//获取名字
	public String showName(){
		System.out.println("员工姓名为："+name);
		return name;
	}
	
	/**
	 * 获取年级
	 * @param 为空
	 * @return age 年纪
	 */
	
	public int sgowAge(){
		System.out.println("员工年纪为："+age);
		return age;
	}
	
	/**
	 * 修改名字
	 * @param _name 预期修改的名字
	 */
	
	public void updateName(String _name){
		name = _name;
	}
	
	/**
	 * 领取工资
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
