package com.test1;

import com.test.A;

public class C {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		A obj = new A(10);
		System.out.println("Value of a: " + obj.a);
		//System.out.println("Value of b: " + obj.b);
		//System.out.println("Value of c: " + obj.c);
		//System.out.println("Value of d: " + obj.d);
		
		System.out.println("###################");
		
		System.out.println("Calling Class A method now");
		obj.print();
	}

}
