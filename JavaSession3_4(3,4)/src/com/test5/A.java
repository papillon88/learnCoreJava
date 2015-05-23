package com.test5;

public class A {
	
	static A obj;
	
	private A(){
		
	}
	
	public static A getA(){
		if(obj == null){
			obj = new A();
		}
		return obj;
	}
	
	public void print(){
		System.out.println("Inside the print method");
	}

}
