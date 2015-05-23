package com.test2;

public class B extends A{
	
	public static void main(String[] args) {

		B obj = new B();
		System.out.println("Value of i: " + obj.i);
		System.out.println("Value of s: " + obj.s);
		
		System.out.println("############  From the Method  #########");
		obj.print();
	}

}
