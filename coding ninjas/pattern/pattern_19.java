public class Solution {
    public static void symmetry(int n) {
        // ite your code here
        
        int inis =0;
		for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i;j++)
        {
            System.out.print("*"+" ");
        }

         for(int j=0;j<inis;j++)
        {
            System.out.print(" "+" ");
        }
        
        for(int j=0;j<n-i;j++)
        {
            System.out.print("*"+" ");
        }
        inis+=2;
        System.out.print("\n");
        }
		
		
		inis = 2*n-2;
		for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
        {
            System.out.print("*"+" ");
        }

         for(int j=0;j<inis;j++)
        {
            System.out.print(" "+" ");
        }
        
        for(int j=0;j<=i;j++)
        {
            System.out.print("*"+" ");
        }
        inis-=2;
        System.out.print("\n");
        }



    }
}
