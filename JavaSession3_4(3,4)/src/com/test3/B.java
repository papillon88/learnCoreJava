package com.test3;

//explain about constructor overloading
// Super keyword
// method overriding


public class B extends A{
	
	static{
		System.out.println("Calling in the static block of Class B....");
	}
	
	
	{
		System.out.println("Calling in the non-static block of Class B....");
	}

	
	B(){
		//super();
		System.out.println("Called in the constructor of B...");
		i = 200;
	}
	
	public void print(){
		System.out.println("Called in the print method of B...");
		System.out.println("Value of i in Class B: " + i);
		System.out.println("Value of s in Class B: " + s);
	}
	
	public void print(int i){
		System.out.println("Called in the sub-class print method with arg...");
		System.out.println("Value of i in Class B: " + i);
		System.out.println("Value of i in Class B: " + this.i);
		System.out.println("Value of s in Class B: " + s);
		
		
		//System.out.println("Value of j in Class B: " + j);
	}
	
	/*public final static void display(){
		System.out.println("Value of i: " + i);
		System.out.println("Value of s: " + s);
	}*/
	
	/*public static void display(){
		System.out.println("from B");
	}*/
	
	public static void main(String[] args) {

		B obj = new B();
		System.out.println("Value of i: " + obj.i);
		System.out.println("Value of s: " + obj.s);
		
		System.out.println("############  From the Method  #########");
		obj.print();
		obj.print(10);
		B.display();
		B obj1=null;
		
		System.out.println("Static variable value of l :" + obj1.l);
		System.out.println("Static variable value of l :" + A.l);
			
	}
	
	
}
