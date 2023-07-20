//odd or even
import java.util.Scanner;
public class Myclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number n");
		int n = sc.nextInt();
		
		if(n%2==0)
		{
			System.out.println("n is even");
		}
		else
		{
			System.out.println("n is odd");
		}
		sc.close();
	}

}
