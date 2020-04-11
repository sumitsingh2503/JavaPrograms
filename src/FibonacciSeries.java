import java.util.Scanner;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		
		int n1=0,n2=1,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many numbers you want");
		int var= sc.nextInt();
		
		System.out.println(n1+" "+n2);
		
		for(int i=2;i<var;i++)
		{
			sum = n1+n2;
			System.out.println(" "+sum);
			n1=n2;
			n2=sum;
		}
		
		
		
	}

}
