package com.neuedu.part02;


/**
 * java�����
 * �����������
 *           +��-��*��/��%ȡ�ࣨ������Ϊ����Ϊ����
 *           ++������--�Լ�    ++���� �ȼӺ���    ����++ ���ú��
 * �����������+=��-=
 * ��ϵ�������>,>=,<,<=,==,!=   ��ϵ�������ǲ�����
 * �߼��������������������͵������еĲ�������
 *          && �߼��� ͬ�����棬�м����
 *          || �߼��� �������棬ͬ�����
 *          ! �߼��� �Խ��ȡ��
 *          �������ڶ�·���㣨&&�жϵ�һ�����ʽ��ֵ���Ϊfalse����ڶ�����ִ�У�||�жϵ�һ�����Ϊt
 *          &��|���ڷǶ�·����������
 * ��Ŀ�������������Ԫ���ʽ��
 * ������ʽ1Ϊ��
 */
public class Test02010702 {
	
	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		System.out.println(-5%-2);
		
		int i= 0;
		//��չ��i++ �Ƿ����̰߳�ȫ�ģ�
		System.out.println(i++ + ++i);//���ʽ���������Ҳ����Ӱ��
		System.out.println("��������ѧϰ�ַ�������"+(i+ ++i));
		
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
