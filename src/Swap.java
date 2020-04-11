
public class Swap {
	
	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		
		//a=a+b;
		//b=a-b;
		//a=a-b;
		
		//System.out.println("After swap "+a+b);
		
		//a=a*b;
		//b=a/b;
		//a=a/b;
		
		b= a+b-(a=b);
		System.out.println("After swap "+"Value of a is"+" "+a+" "+"Value of b is"+" "+b);

		
	}

}
