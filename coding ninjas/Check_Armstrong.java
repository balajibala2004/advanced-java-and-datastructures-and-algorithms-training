import java.util.*;
import java.lang.*;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int res1 = n;
		int res = n;
int count =0;
	int digit =0;
	int sum =0;
	while(res!=0)
	{
		count++;
		res=res/10;
		
	}
	while(n!=0)
	{
		digit=n%10;
		sum += Math.pow(digit,count);
		n=n/10;
	}
	if(res1==sum)
	{
		System.out.println("true");

	}
	else {
	System.out.println("false");
	}
	}
}
