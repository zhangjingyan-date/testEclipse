package com.neuedu.part06;


/**
 * ����������
 * ����һ��ģ�壬�����Ƶ�һ���ض�����Ķ������һ���࣬����ͨ���ඨ����һ���������Ժ���Ϊ
 * 
 * ��Ľṹ
 * [public][abstract|final]class ����[extends����][implements�ӿ��б�]
 * {
 * ������������ʼ����
 * ���������������壻
 * }
 * д�ഴ������
 * ��д���ԣ�����֮����������ɫ�����еķ����ﶼ����ֱ��ʹ�ã�������Ĭ��ֵ��StringĬ����null��intĬ��0
 * ������ȫ�ֿ��ã�ȫ�ֱ���������Ҫ��ʼ���Ϳ���ʹ��
 * �����еı��� ֻ�ڶ�Ӧ�������ڿ��ã��Ǿֲ���������ʹ�ñ����ʼ��
 * 
 * �������ʵ�ʵĸ��壨ʵ����
 * ʵ����
 * 
 * �������ջ���
 * �������й����У���һ�������ȼ����̣߳�gc�����д�����Ϊ���Ʋ���
 * һ�����и��̣߳���Ѱ��û�����õĶ��󣬵���
 * 
 * �������й����У���
 *
 */

public class Test06011301 {
	
	public static void main(String[] args) {
		//  ����      �������              ������
		Employee epl = new Employee();//����һ������
		epl.age=20;
		epl.name="����";
		//ͨ�� ���� ȥ������Ӧ�������Ժͷ���
		System.out.println(epl.showName());
		System.out.println(epl.showAge());
		
		Employee epl2 = new Employee();
		System.out.println(epl);
		System.out.println(epl2);
		
	}

}
