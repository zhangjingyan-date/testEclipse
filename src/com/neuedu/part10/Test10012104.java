package com.neuedu.part10;

import java.util.ArrayList;
import java.util.Date;

public class Test10012104 {

	public static void main(String[] args) {
		/*
		 * ��ϵͳ������˾Ա���ṩ��һ����ϵͳ
		 * Ա������Ϣ��ϵͳ�Ļ������ݣ�Ա������Ϣ������ID ���� 
		 * �ṩ�Ĺ��ܵ㣺
		 * 1-------------ǩ��
		 * 2-------------ǩ��
		 * 3-------------��ѯ����Ϣ  ����¼��ʱ�� ���Բ�ѯ��7�� ��1��ǩ��ǩ��Ϊһ�죩
		 * 4-------------�˳�
		 * ǩ�����򿨵�Ա�������ǹ�˾����Ա��
		 * ǩ�ˣ��򿨵�Ա�������ǹ�˾����Ա����ֻ�е���ǩ����Ա���ſ���ǩ��
		 * ͬһ�첻���ظ�ǩ����ǩ��
		 * 
		 */
		 //0.��Ҫ��ʼ��һ����Ź�˾����Ա���ļ���
		 //1.Ӧ���и�ȷ��Ա����Ϣ��¼����
		 //2.�򿨼�¼������һ��������
		 //3.��֮���˳���¼����

	}

}


class Employee {
	
	private int ID;
	
	private String name;
	
    //���Ա���򿨼�¼������ 
	//���� 7��������7����ʱ�����ζ���
	private ArrayList<CheckInRecord> arrayList = new ArrayList<>();
	
	
	public Employee(int ID, String name){
		this.ID = ID;
		this.name = name;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<CheckInRecord> getArrayList() {
		return arrayList;
	}

	public void setArrayList(ArrayList<CheckInRecord> arrayList) {
		this.arrayList = arrayList;
	}
	
	
	
	
}

class CheckInRecord {
	
	private String checkFlag;//Ĭ����ǩ��״̬��Ա��ǩ��ʱ���ж�״̬Ϊǩ�ˣ�����ǩ����ǩ��֮��ֻ��ǩ��
	
	private Date checkInTime;
	
	private Date checkOutTime;
	
	
	public String getCheckFlag() {
		return checkFlag;
	}

	public void setCheckFlag(String checkFlag) {
		this.checkFlag = checkFlag;
	}

	public Date getCheckInTime() {
		return checkInTime;
	}

	public void setCheckInTime(Date checkInTime) {
		this.checkInTime = checkInTime;
	}

	public Date getCheckOutTime() {
		return checkOutTime;
	}

	public void setCheckOutTime(Date checkOutTime) {
		this.checkOutTime = checkOutTime;
	}
	
	
	
}
