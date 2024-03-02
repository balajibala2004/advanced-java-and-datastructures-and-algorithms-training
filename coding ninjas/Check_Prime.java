import java.util.Scanner;
public class Solution {

    public static void main(String[] args) {
        //Your code goes here
    Scanner sc = new Scanner(System.in);
		int c=0;
		int n=sc.nextInt();
		for(int i =2;i<=Math.sqrt(n);i++)
		{
			if(n%i==0)
			{
                c=1;
				System.out.print(false);
			}
		}
	        
		if(c!=1) 
        {
            System.out.print(true); 
        }     
    }

}
