package com.nguyenbanh.Spring_3HelloWorld;

public class HelloWorld {

	private String name;
	public void setName(String name1){
		this.name = name1;
	}
	
	public void printHello(){
		System.out.println("hello " + name);
	}

}
