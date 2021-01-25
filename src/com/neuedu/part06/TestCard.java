package com.neuedu.part06;

import java.util.Random;

public class TestCard {

	public static void main(String[] args) {
		//作业：创建一个扑克牌类（花色和值），不算大小王 
		//1.放数组中52张牌 
		//2.洗牌乱序 
		//3.判断洗牌后的前三张是否是同花顺 
		//4.求第一次出现同花顺时，一共洗了多少次牌
		
		//4大类  方片  梅花  黑桃  红桃
		//A--K
		Card[] cardarry = new Card[52];
		
		String[] colora = {"方片","梅花","黑桃","红桃"};
		
		String[] numa = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		//创建对象
		for(int i=0;i<colora.length;i++){
			for(int j=0;j<numa.length;j++){
				String nums = numa[j];
				int count = 0;
				if("A".equals(nums)){//字符串比较用equals
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
		//洗牌
		Random r = new Random();
		for(int i=0;i<100;i++){//控制洗牌100次
			//定义中间对象，和最后一张交换
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
