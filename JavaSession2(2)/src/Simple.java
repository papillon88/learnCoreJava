public class Simple {
	
	static String x = "XYZ";
	int g = 200;
	

	public static void main(String arg[]){
		
		int a = 5;
		float b = 3.0f;
		boolean bl = false;
		long l = 100L;
		double d = 21.0; 
		char c = 'c';
		
		a = 15;
		int a1 = 20;
		int diff = a1-a;
		
		System.out.println("Value of a1- a :" + diff);
		
		String abc = "Hello";
		String bcd = "Hello";
		
		System.out.println("Hello");
		System.out.println("Value of a :" + a);
		System.out.println("Value of abc :" + abc);
		System.out.println("Value of l :" + l);
		
		/*
		String[] args = new String[2];
		args[0] = "abc";
		args[1] = "bcd";
		System.out.println("Array of args-1 :" + args[0] );
		System.out.println("Array of args-2 :" + args[1] );
		*/
		
		//System.out.println("Array of arg-1 :" + arg[0] );
		//System.out.println("Array of arg-2 :" + arg[1] );
		
		//System.out.println("Value of g :" + g);
		System.out.println("Value of x :" + x);
		
		Simple obj = new Simple();
		System.out.println("Value of g :" + obj.g);
		
	}
}