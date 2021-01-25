package com.neuedu.part07;

import java.util.UUID;

/**
 * 多态
 * 通过父类引用调用方法，在程序运行时才能确定方法的形态功能的现象
 * 形成多态的必要条件：
 * 1.有继承或实现关系
 * 2.需要重写方法
 * 3.父类引用指向子类的对象（向上转型）
 * 
 * 多态的使用场景：
 * 1.参数多态
 * 2.返回值多态
 * 
 * 静态 static
 * 可以修饰：方法，属性，代码块，一般用来修饰类的成员，不能修饰局部变量（用static修饰的类的成员可以不通过引用调用，直接用类名调用）
 * static 修饰属性能实现数据共享，为类变量，在类被载入时创建，类存在变量就存在
 * static 修饰方法为类方法，在类被载入时创建，类存在变量就存在
 * static 修饰代码块，静态到马快，优先于构造方法被调用，一般用于静态属性的初始化
 * 为什么静态方法中，只能调用静态方法和静态属性？
 * 因为在static修饰的类成员加载比较早，调用非静态成员或方法可能找不到
 * 
 * 类被载入的时机：
 * 1.new 对象时
 * 2.类名调用静态属性和方法时候
 * 
 * 单例模式（设计模式）Singleton
 * 类只能有一个实例（对象）
 * 1.不能让它创建多个对象，需要把构造函数藏起来private修饰
 * 2.还得通过构造函数创建对象，需要在单例类创建一个对象，想要在碗面使用 需要是静态方法
 * 3.这个对象需要可以进行业务处理功能（逻辑），不能直接给人用，需要放在一个方法里获取
 * 4.这个方法的返回值就是这个对象，想要在外面使用 需要是静态方法
 * 5.静态方法里面对象 需要也是静态的，所以需要加上static，这时，对象又可以直接获取了
 * 6.为了不能直接点出这个对象，把这个对象定义过程 设为私有
 * 
 * 两种单例模式
 * 饿汉式 new过程在外面
 * 饿汉式 new过程在方法里，进来先判断如果对象没创建 就创建，不然直接返回
 * 
 * 目前为止，还没有实现真正的单例，解决不了并发问题
 * 
 * final 关键字
 * final 可以用来修饰类，属性，方法，局部变量
 * final 修饰类 这个类不能被继承
 * final 修饰属性 和局部变量 时 都不可以被重新赋值
 * 修饰属性时，一般和static一起用
 * final 修饰方法的时候，不能被覆盖
 * 
 * 面试：final和static的区别？
 * 
 * 抽象类
 * 程序设计时，一个类没有特定需要实现的功能，只需要别的类继承 实现他的行为，这种时候，可以设置为一个抽象类
 * 定义：使用abstract 修饰class
 * 组成：可以有正常类的成员，还可以有抽象方法
 * 抽象类可以继承类，抽象类里可以没有抽象方法
 * 抽象类不可以实例化
 * 子类继承抽象共需要实现父类的抽象方法，如果
 * 
 *
 */
public class Test07011402 {
	static boolean bo;
	String bo1;
	
	
	public static void main(String[] args) {
		China china2 = new China();
		
		final int i = 1;
		System.out.println(UUID.randomUUID());
		System.out.println(Singleton.getInstance());
		System.out.println(Singleton.getInstance());
	}

	
	//非静态方法中 调用静态方法和属性
	public void test(){
		System.out.println(bo);
	}

}

class China{
	
	String name;
	public static final String MAX_COUNTRY;
	String age;
	
	public China() {
		System.out.println("我是构造方法");
	}
	
	static{
		MAX_COUNTRY = "中国";
	}
}
