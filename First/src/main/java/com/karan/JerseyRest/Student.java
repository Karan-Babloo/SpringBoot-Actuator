package com.karan.JerseyRest;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Student {
	private String name;
	private int number;
	private String address;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int number, String address) {
		super();
		this.name = name;
		this.number = number;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

}
