package training;

import java.util.Scanner;
//binary addition
public class myclass
{

	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first number for addition");
		long a = sc.nextLong();
		System.out.println("enter the second number for addition");
		long b = sc.nextLong();
		int[] sum = new int[6];
		int remainder=0 ;
		int i = 0;
		
		while(a!=0||b!=0)
	{
			sum[i++] =(int) (a%10 + b%10 + remainder)%2;
			remainder = (int)(a%10 + b%10 + remainder)/2;
			
			a = a / 10 ;
			b = b / 10 ;
			
		}
		 
		if (remainder!=0)
		{
			sum[i++] = remainder ;
		}
		System.out.print("Output: ");
		
		while (i >= 0) {
			System.out.print(sum[i--]);
		}
		sc.close();
		
		
		
	}
	
	
		
		
	
}
