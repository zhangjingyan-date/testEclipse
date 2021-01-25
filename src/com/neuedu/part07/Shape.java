package com.neuedu.part07;

public class Shape {
	
	private int area;
	private int per;
	private String color;
	
	public Shape(){
		
	}
	
	public Shape(String color){
		this.color = color;
	}

	public int getArea() {
		return area;
	}

	public int getPer() {
		return per;
	}

	public String getColor() {
		return color;
	}
	
	public void showAll(){
		System.out.println("����ǣ�"+area);
		System.out.println("�ܳ��ǣ�"+per);
		System.out.println("��ɫ�ǣ�"+color);
	}
	
	
	
	
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(10,10,"��ɫ");
		Circle circle = new Circle(10,"��ɫ");
		rectangle.showAll();
		circle.showAll();
	}
	
}

class  Rectangle extends Shape{
	
	private int weight;
	private int height;
	
	public Rectangle(){
		
	}
	
	public Rectangle(int weight,int height,String color){
		super(color);
		this.weight = weight;
		this.height = height;
	}

	public void getColor(int i) {
		
	}
	
	@Override
	public int getArea() {
		return weight*height;
	}

	@Override
	public int getPer() {
		return (weight+height)*2;
	}

	@Override
	public void showAll() {
		System.out.println("����ǣ�"+getArea());
		System.out.println("�ܳ��ǣ�"+getPer());
		System.out.println("��ɫ�ǣ�"+getColor());
		System.out.println("�����ǣ�"+this.height);
		System.out.println("����ǣ�"+this.weight);
	}
	
}

class Circle extends Shape{
	
	private int radius;
	
	public Circle(){
		
	}
	
	public Circle(int radius,String color){
		super(color);
		this.radius = radius;
	}

	@Override
	public int getArea() {
		return 3*radius*radius;
	}

	@Override
	public int getPer() {
		return 2*3*radius;
	}

	@Override
	public void showAll() {
		System.out.println("����ǣ�"+getArea());
		System.out.println("�ܳ��ǣ�"+getPer());
		System.out.println("��ɫ�ǣ�"+getColor());
		System.out.println("�뾶�ǣ�"+this.radius);
	}
	
	
	
}
