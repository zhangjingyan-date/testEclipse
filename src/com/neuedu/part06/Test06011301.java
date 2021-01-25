package com.neuedu.part06;


/**
 * 面向对象基础
 * 类是一个模板，把相似的一类特定种类的对象归着一个类，可以通过类定义这一类对象的属性和行为
 * 
 * 类的结构
 * [public][abstract|final]class 类名[extends父类][implements接口列表]
 * {
 * 属性声明及初始化；
 * 方法声明及方法体；
 * }
 * 写类创建过程
 * 先写属性：定义之后属性名变色，类中的方法里都可以直接使用（属性有默认值）String默认是null，int默认0
 * 属性是全局可用，全局变量，不需要初始化就可以使用
 * 方法中的变量 只在对应作用域内可用，是局部变量，想使用必须初始化
 * 
 * 对象：类的实际的个体（实例）
 * 实例化
 * 
 * 垃圾回收机制
 * 程序运行过程中，由一个低优先级的线程（gc）进行处理，人为控制不了
 * 一旦运行该线程，会寻找没有引用的对象，调用
 * 
 * 程序运行过程中，由
 *
 */

public class Test06011301 {
	
	public static void main(String[] args) {
		//  类名      类对象名              构造器
		Employee epl = new Employee();//创建一个对象
		epl.age=20;
		epl.name="张三";
		//通过 引用 去操作对应对象属性和方法
		System.out.println(epl.showName());
		System.out.println(epl.showAge());
		
		Employee epl2 = new Employee();
		System.out.println(epl);
		System.out.println(epl2);
		
	}

}
