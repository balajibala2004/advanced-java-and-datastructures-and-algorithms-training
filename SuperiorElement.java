import java.util.*;
public class Solution {
    public static List< Integer > superiorElements(int []a) {
        // Write your code here.
        ArrayList<Integer> ans = new ArrayList<>();
        int n = a.length;
     
        for(int i =0;i<n;i++)
        {
             boolean leader = true;
            for(int j=i+1;j<n;j++)
            {
                if(a[j]>=a[i])
                {
                    leader = false;
                    break;
                }
            }

            if(leader)
            {
                ans.add(a[i]);
            }
        }

        Collections.reverse(ans);
        return ans;
        
    }
}
