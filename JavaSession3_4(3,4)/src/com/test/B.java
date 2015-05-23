package com.test;

public class B {

	/**
	 * @param args
	 */
	//c = "any";
	/*public void disp(){
		System.out.println(c);
	}*/
	
	public static void main(String[] args) {

		
		//A obj = new A(10);
		A obj = new A(100.0f);
		//A obj = new A("Hello");
		System.out.println("Value of a: " + obj.a);
		//System.out.println("Value of b: " + obj.b);
		System.out.println("Value of c: " + obj.c);
		System.out.println("Value of d: " + obj.d);
		
		System.out.println("###################");
		
		System.out.println("Calling Class A method now");
		obj.print();
		
		System.out.println("###################");
		System.out.println("Value of a: " + obj.a);
		//System.out.println("Value of b: " + obj.b);
		System.out.println("Value of c: " + obj.c);
		System.out.println("Value of d: " + obj.d);
		
	}

}
