import java.util.*;

public class Solution {
    public static String read(int n, int []book, int target){
        // Write your code here.
        HashMap<Integer , Integer> mpp = new HashMap<>();
       for(int i=0;i<n;i++)
       {
           int num = book[i];
           int need = target - num;
           if(mpp.containsKey(need))
           {
               return "YES";
           }

           mpp.put(book[i], i);
       }
       return "NO";
    }
}
