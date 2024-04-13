public class Solution {
    public static String read(int n, int []book, int target){
        // Write your code here.

       int left = 0;
       int right = n-1;
       while(left<=right)
       {
           int sum = book[left] + book[right];
           if(sum == target)
           {
              return "YES";
           }
           if(sum < target)
           {
               left++;
           }
           else{
               right --;
           }

       }
       return "NO";
    }
}
