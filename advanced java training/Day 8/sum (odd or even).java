import java.util.Scanner;
public class Myclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number a");
		int a = sc.nextInt();
		System.out.println("Enter number b");
		int b = sc.nextInt();
		int sum = a + b ;
		System.out.println("sum is " + sum);
		if(sum %2==0)
		{
			System.out.println("sum is even");
		}
		else
		{
			System.out.println("sum is odd");
		}
		sc.close();
	}

}
