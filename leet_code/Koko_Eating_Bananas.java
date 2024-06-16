import java.util.*;

class Solution {

    public static int Max(int[] v)
    {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<v.length;i++)
        {
            max = Math.max(max,v[i]);
        }
        return max;
    }

    public static int func(int[] arr , int mid)
    {
        int hours = 0;
        for(int i=0;i<arr.length;i++)
        {
            hours += Math.ceil((double)(arr[i]) /(double) (mid)) ;
        }

        return hours;
    }
    public int minEatingSpeed(int[] arr, int h) {
        int low =0;
        int high = Max(arr);
        
        while(low<=high)
        {
            int mid = (low+high)/2;

            int thours = func(arr,mid);

            if(thours<=h)
            {
                high = mid-1;
            }

            else
            {
                low = mid+1;
            }
        }

        return low;
        

    }
}
