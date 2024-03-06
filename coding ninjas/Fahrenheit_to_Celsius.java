import java.util.* ;
import java.io.*; 
class Solution {
	
	public static void main(String args[]) {
		
	Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
       for(int i=a;i<=b;i+=c)
      {
    	   
    	   double ce =((5/9.0)*(i-32));
    	   ce = (ce>=0)? Math.floor(ce):Math.ceil(ce);
    	   //int temp = "%.0f",ce;
    	  // System.out.println(ce);
    		System.out.println(i + " " +(int) ce);
    		
    	   
       }
	}
}
