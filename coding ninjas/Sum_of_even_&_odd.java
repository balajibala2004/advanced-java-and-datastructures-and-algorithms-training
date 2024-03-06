import java.util.*;
class Solution {
	
	public static void main(String args[]) {
		
		// Write code here
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int temp;
		int esum=0;
		int osum=0;
		
       while(a>1)
       {
    	   temp=a%10;
    	   if(temp%2==0)
    	   {
    		   esum+=temp;
    	   }
    	   else
    	   {
    		   osum+=temp;
    	   }
    	   a=a/10;
       }
	         System.out.println(esum + " " + osum);
      
	}
}
