package com.neuedu.part03;

import java.util.Scanner;

public class zuoye {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		//1.��֪a,b�������ͱ�����д����a,b���������е�ֵ�����ĳ���
		int a =5;
		int b =6;
		int c =a;
		a = b;
		b = c;
		System.out.println(a);
		System.out.println(b);
		
		//2. ����һ��0��1000�����������λ���ĺͣ�����345�Ľ����3+4+5��12ע���ֽ����ּȿ����ȳ���ģҲ������ģ�����
		int a1 = 456;
		int ge = a1%10;
		int shi = a1/10%10;
		int bai = a1/100%10;
		int sum = ge + shi + bai;
		System.out.println(sum);
		
		//3.�����¶Ⱥ������¶Ȼ���ת�����ӻ��϶ȱ�����϶���ֻҪ��ȥ32������5�ٳ���9�����ˣ������϶�ת�ɻ��϶ȣ�ֱ�ӳ���9������5���ټ���32���С�
		int hua = 50;
		int she = (hua-32)*5/9;
		System.out.println(she);
		
		//4.����һ������Ĵ�д��ĸA~Z��ת��ΪСд��ĸ��
		char c1 = 'A';
		char c2 = 'A' + 32;
		System.out.println(c2);
	}
}