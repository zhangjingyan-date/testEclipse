package demo;

import java.util.Calendar;

public class Test09012003 {
	
	public static void main(String[] args) {
		//�����ǰ�µ�����
		Calendar instance = Calendar.getInstance();
		instance.set(Calendar.DATE,1);
		
		System.out.println("һ     ��     ��    ��    ��    ��   ��");
		int start = instance.get(Calendar.DAY_OF_WEEK)-1;
		System.out.print("            ");
		for(int i=1;i<=31;i++){
			if(i<10){
				System.out.print(" "+i+" ");
			}else{
				System.out.print(i+" ");
			}
			if((start+i-1)%7==0){//ÿһ��7�����߻���
				System.out.println();
			}
		}
	}

}
