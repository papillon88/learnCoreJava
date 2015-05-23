package com.test;

public class A {

	public int a ;
	private float b = 10.0f;
	protected String c = "HI";
	long d ;
	
	/*public A(){
		
	}*/
	
	public A(){}
	
	public A(int i){
		a = i;
	}
	
	public A(String j){
		c = j;
	}
	
	public A(float f){
		b = f;
	}
	
	//method
	/*
	 * This method is to print the values
	 */
	public void print(){
		
		this.a = 100;
		this.d = 1L;
		
		int j =0;
		
		System.out.println("Value of a: " + a);
		System.out.println("Value of b: " + b);
		System.out.println("Value of c: " + c);
		System.out.println("Value of d: " + d);
	}

}
