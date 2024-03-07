import java.util.* ;
import java.io.*; 
public class Solution{
    public static int fibonacciNumber(int n){
        // Write your code here.
        Scanner sc = new Scanner(System.in);
		int MOD = 1000000007;
		int a =1;
		int b=1;
		int c=0;
		
        if(n==1 || n==2)
        {
            return 1;
        }
       for(int i=3;i<=n;i++)
       {
    	   c=(a+b)% MOD;
    	   a=b;
    	   b=c;
       }
      return c;
    }
}
