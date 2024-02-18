public class Solution {
    public static void nNumberTriangle(int n) {
        // Write your code here
        int r = 1;
        for(int i=1;i<=n;i++)
        {
         for(int j=1;j<=i;j++)
        {
            System.out.print(r + " ");
            r++;
        }   
        System.out.print("\n");
        }
    }
}
