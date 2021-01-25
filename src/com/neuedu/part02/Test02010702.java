package com.neuedu.part02;


/**
 * java运算符
 * 算术运算符：
 *           +，-，*，/，%取余（被除数为正就为正）
 *           ++自增，--自减    ++变量 先加后用    变量++ 先用后加
 * 复制运算符：+=，-=
 * 关系运算符：>,>=,<,<=,==,!=   关系运算结果是布尔型
 * 逻辑运算符：针对两个布尔型的数进行的布尔运算
 *          && 逻辑与 同真则真，有假则假
 *          || 逻辑或 有真则真，同假则假
 *          ! 逻辑非 对结果取反
 *          以上属于短路运算（&&判断第一个表达式的值如果为false，则第二个不执行，||判断第一个如果为t
 *          &，|属于非短路（运行慢）
 * 三目条件运算符（三元表达式）
 * 如果表达式1为真
 */
public class Test02010702 {
	
	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		System.out.println(-5%-2);
		
		int i= 0;
		//扩展：i++ 是否是线程安全的？
		System.out.println(i++ + ++i);//表达式运算过程中也会受影响
		System.out.println("这是用来学习字符串连接"+(i+ ++i));
		
		int x1 = 3, y1 = 5;
		int x2 = 3, y2 = 5;
		int r1, r2;
		r1 = x1++ + x1*y1;
		r2 = ++x2 + x2*y2;
		System.out.println("x1="+x1+" y1="+y1+" r1="+r1);
		System.out.println("x2="+x2+" y2="+y2+" r2="+r2);
		
		System.out.println(5.0/2);
		
		x1 = x1 + 3;
		x1 += 3;
		System.out.println(x1);
		
		System.out.println(x1 != x2);
		
		int x = 1, y = 2, z = 3;
		y+=z--/++x;
		System.out.println(y);
		
		int i1 = 3;
		System.out.println(i/6*5);
		
		int x3 =23,m,n;
		m = x3/100;
		n = x3%10;
		System.out.println(m);
		System.out.println(n);
		
		int x4 = 2;
		System.out.println((x++)*3);
		
		float x5 = 3.5f, y5 =4.6f, z1 =5.7f;
		System.out.println(x5 != y5);
		
		int a = 6, b;
		b = a++*3;
		System.out.println(a);
		System.out.println(b);
		
		int x6 = 2;
		System.out.println(x6++/3);
		
		boolean flag = true,flag1 = false;
		
		System.out.println(flag & flag1);//false
		System.out.println(flag | flag1);//true
		System.out.println(flag ^ flag1);//true
		
		System.out.println(flag & flag1?3-1:4+1);
		
		
	}


}
