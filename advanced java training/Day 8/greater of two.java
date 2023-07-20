import java.util.Scanner;
public class Myclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number a");
		int a = sc.nextInt();
		System.out.println("Enter number b");
		int b = sc.nextInt();
		if(a>b)
		{
			System.out.println("a is bigger");
		}
		else
		{
			System.out.println("b is bigger");
		}
		sc.close();
	}

}
