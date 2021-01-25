package com.neuedu.part07;

public class Bus {
	
	public int parkingFee() {
		return 0;	
	}

}

class MinBus extends Bus{
	
	private int hour;
	
	public int getHour() {
		return hour;
	}
	
	public void setHour(int hour) {
		this.hour = hour;
	}
	
	

	@Override
	public int parkingFee() {
		// TODO Auto-generated method stub
		return super.parkingFee();
	}
	
	
		
	}
