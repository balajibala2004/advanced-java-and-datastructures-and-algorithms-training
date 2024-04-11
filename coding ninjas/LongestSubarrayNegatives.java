import java.util.*;
public class Solution {
    public static int longestSubarrayWithSumK(int []a, long k) {
        // Write your code here
        int n = a.length;
        HashMap<Long , Integer> preSumMap = new HashMap<>();

        long sum = 0;
        int maxLen = 0;
        for(int i =0;i<n;i++)
        {
            sum +=a[i];

            if(sum ==k)
            {
                maxLen = Math.max(maxLen, i+1);
            }

            long rem = sum -k;

            if(preSumMap.containsKey(rem))
            {
                int len = i- preSumMap.get(rem);
                maxLen = Math.max(maxLen,len);
            }

            if(  !preSumMap.containsKey(sum))
            {
                preSumMap.put(sum,i);
            }
           
        }
         return maxLen;
    }
}
