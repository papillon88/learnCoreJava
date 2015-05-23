package com.test6;

public class B extends A{

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//A obj = new A();
		
		B obj = new B();
		obj.print();
		obj.print1();
		obj.display();
		
	}

	@Override
	public void display() {
		System.out.println("Printing the method display here....");
	}

}
