public class Solution {
    public static void alphaTriangle(int n) {
        // Write your code here
       char ch =(char)('A'+(n-1));
		
		for(int i=0;i<n;i++)
			{
				
				for(int j=0;j<=i;j++)
	            {
	                System.out.print(ch + " ");
	                ch--;
	            }
	            ch =(char)('A'+(n-1));
				
				
				System.out.print("\n");
			}
    }
}
