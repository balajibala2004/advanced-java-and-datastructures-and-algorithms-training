package training;

import java.util.Scanner;

public class myclass
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the steps for right rotation");
		int d = sc.nextInt();
		int[] arr = new int[] {1,2,3,4,5};
		int n = arr.length;
		System.out.println("size of array is " + n);
		
		
		sc.close();
		myclass obj = new myclass();
		
		obj.rotate(arr,n,d);
	}
	
	public void rotate(int[] arr,int n, int d)
	{	int[] temp = new int[n] ;
		int k = 0;
		int s = n-d ;
		
		
		for(int i=n-1;i>=s;i--)
		{
			temp[k] = arr[i];
			k++;
		}
		
		
		
		
		for(int i=0;i<s;i++)
		{
			temp[k] = arr[i];
			k++;
		}
		
		
		System.out.println("Array elements after right rotations were" );
		for(int i=0;i<n;i++)
		{
			arr[i] = temp[i];
			
			
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		
		
	}
}
