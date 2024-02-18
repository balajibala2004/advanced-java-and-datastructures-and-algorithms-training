public class Solution {
    public static void numberCrown(int n) {
        // Write your code here.     int start = 1;
      
		 for(int i=1;i<=n;i++)
	        {
			 int space = 2 *(n-i);
	            for(int l=1;l<=i;l++)
	            {
	                System.out.print(l+" ");
	            }

	            for(int j=1;j<=space;j++)
	            {
	                System.out.print(" ");
	            }
	            for(int k=i;k>=1;k--)
	            {
	                System.out.print(k + " ");
	            }
	            space-=2;
	            System.out.print("\n");
	        }
		
    }
}
