import java.util.* ;
import java.io.*; 
class Solution {
	
	public static void main(String args[]) {
		
		// Write code here
		Scanner sc = new Scanner(System.in);
		int res = 1;
			int a = sc.nextInt();
				int b = sc.nextInt();
				for(int i=1;i<=b;i++)
				{
					res*=b;
				}
				if((a==0 && b==0) || (b==0))
				{
					System.out.println(1);
				}
				else if(a==0)
				{
					System.out.println(0);
				}
				
				
				else
				{
					System.out.println(res);
				}
	}
}
