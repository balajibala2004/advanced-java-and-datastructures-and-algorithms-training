// User function Template for Java

class Solution {
    static void bitManipulation(int num, int i) {
        // code here
        
        int t = (num>>i-1)&1;
        
        System.out.print(t + " ");

        
        int t1 = (1<<i-1)|num;
        System.out.print(t1 + " ");
        
        int t3 = (~(1<<i-1))& num;
        System.out.print(t3 + " ");
        
        
    }
}
