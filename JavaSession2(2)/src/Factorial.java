
public class Factorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		if(args.length==0){
			System.out.println("Please enter the param value to find factorial in the range : 1-5  and rerun the program");
			System.exit(0);
		}
		System.out.println("You have entered the value :" + args[0]);
		int n = Integer.parseInt(args[0]);
		if(n>5){
			System.out.println("Please enter the value in the range : 1-5  and rerun the program");
			System.exit(0);
		}
		
		int fact = 0;
		if(n==1){
			fact = 1;
		}else if(n == 2){
			fact = 1*2;
		}else if(n == 3){
			fact = 1*2*3;
		}else if(n == 4){
			fact = 1*2*3*4;
		}else {
			fact = 1*2*3*4*5;
		}
		
		System.out.println("Factorial of " + n + " is :" + fact);
		
	}

}
