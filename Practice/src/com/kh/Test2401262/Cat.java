package com.kh.Test2401262;

public class Cat extends Animal{
	private String location;
	private String color;
	
	public Cat() {
		super();
	}

	public Cat(String name, String kinds, String location, String color) {
		super(name, kinds);
		this.location = location;
		this.color = color;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void speak() {
		System.out.println(super.toString() + this.getLocation() + "에 서식하며, 색상은 " + this.getColor() + "입니다. ");
	}
	
}
