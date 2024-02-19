public class Solution {
    public static void nLetterTriangle(int n) {
         char ch = 'A';
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>=i;j--)
            {
                System.out.print(ch + " ");
                ch ++;
            }
            System.out.print('\n');
            ch = 'A';
        }
		

    }
}
