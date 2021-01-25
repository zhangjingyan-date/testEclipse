package com.neuedu.part03;

import java.util.Scanner;

public class zuoye {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		//1.已知a,b均是整型变量，写出将a,b两个变量中的值互换的程序。
		int a =5;
		int b =6;
		int c =a;
		a = b;
		b = c;
		System.out.println(a);
		System.out.println(b);
		
		//2. 给定一个0～1000的整数，求各位数的和，例如345的结果是3+4+5＝12注：分解数字既可以先除后模也可以先模后除。
		int a1 = 456;
		int ge = a1%10;
		int shi = a1/10%10;
		int bai = a1/100%10;
		int sum = ge + shi + bai;
		System.out.println(sum);
		
		//3.华氏温度和摄氏温度互相转换，从华氏度变成摄氏度你只要减去32，乘以5再除以9就行了，将摄氏度转成华氏度，直接乘以9，除以5，再加上32即行。
		int hua = 50;
		int she = (hua-32)*5/9;
		System.out.println(she);
		
		//4.给定一个任意的大写字母A~Z，转换为小写字母。
		char c1 = 'A';
		char c2 = 'A' + 32;
		System.out.println(c2);
	}
}