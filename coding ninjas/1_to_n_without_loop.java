public class Solution {
    public static int[] printNos(int x) {
        // Write Your Code Here
         int[] arr = new int[x];
        for (int i = 0; i < x; i++) {
            int temp = i;
            arr[i] =temp+1 ;
        }
        return arr;
        
        //System.out.print(n + " ");
    }
}
