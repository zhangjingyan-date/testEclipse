package com.neuedu.part06;

import java.util.Random;

public class TestCard {

	public static void main(String[] args) {
		//��ҵ������һ���˿����ࣨ��ɫ��ֵ���������С�� 
		//1.��������52���� 
		//2.ϴ������ 
		//3.�ж�ϴ�ƺ��ǰ�����Ƿ���ͬ��˳ 
		//4.���һ�γ���ͬ��˳ʱ��һ��ϴ�˶��ٴ���
		
		//4����  ��Ƭ  ÷��  ����  ����
		//A--K
		Card[] cardarry = new Card[52];
		
		String[] colora = {"��Ƭ","÷��","����","����"};
		
		String[] numa = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		//��������
		for(int i=0;i<colora.length;i++){
			for(int j=0;j<numa.length;j++){
				String nums = numa[j];
				int count = 0;
				if("A".equals(nums)){//�ַ����Ƚ���equals
					count = 1;
				}else if ("J".equals(nums)){
					count = 11;
				}
				
				
				cardarry[(i*13)+j] = new Card(colora[i], numa[j]);
			}
		}
		for(Card item:cardarry){
			System.out.print(item.color+" "+item.num+" ");
		}
		//ϴ��
		Random r = new Random();
		for(int i=0;i<100;i++){//����ϴ��100��
			//�����м���󣬺����һ�Ž���
			int nextInt = r.nextInt(52);
			Card tempCard = cardarry[nextInt];
			cardarry[nextInt] = cardarry[cardarry.length-1];
			cardarry[r.nextInt(52)]= cardarry[cardarry.length-1];	
		}
		System.out.println();
		for(Card item:cardarry){
			System.out.print(item.color+" "+item.num+" ");
		}

	}

}
