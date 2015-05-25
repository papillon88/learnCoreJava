package com.test3;

public class A {

	int i;
	String s;
	final int j = 100;
	static long l = 100L;
	
	static{
		System.out.println("Calling in the static block of A....");
	}
	
	
	{
		System.out.println("Calling in the non-static block A....");
	}
	
	
	
	A(){
		i = 100;
		s = "Hi";
		System.out.println("Called in the constructor of A...");
	}
	
	public void print(){
		System.out.println("Called in the print method of A...");
		System.out.println("Value of i: " + i);
		System.out.println("Value of s: " + s);
		
	}
	
	public static void display(){
		System.out.println("Value of l using static: " + l);
		//System.out.println("Value of s using static:  " + s);
	}
}
