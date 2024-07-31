import java.util.*;

class Solution {
    public int maxScore(int[] cs, int k) 
    {
           int lsum=0,maxsum=0,r=cs.length-1;
          for(int i=0;i<=k-1;i++)
          {
            lsum += cs[i];
          }
          maxsum = Math.max(maxsum,lsum);
          
          for(int j=k-1;j>=0;j--)
          {
            lsum -= cs[j];
            lsum += cs[r];
            r--;
            maxsum = Math.max(maxsum,lsum);
          
          }
        return maxsum;
    }
}
