class Solution {
    public static int  func(int[] arr , int mid)
    {
        int sum = 0;
        for(int i=0;i<arr.length;i++)
        {
            sum += Math.ceil((double) arr[i] / (double) mid);
        }

        return sum;
    }

    public static int Max(int[] arr)
    {
        int maxe= Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            maxe = Math.max(maxe,arr[i]);
        }

        return maxe;
    }

    public int smallestDivisor(int[] nums, int t) {
        int low =1;
        int high = Max(nums);

        while(low<=high)
        {
            int mid = (low+high)/2;

            if(func(nums , mid) <= t)
            {
                high = mid -1;
            }
            else
            {
                low = mid + 1;
            }
        }

        return low ;
    }
}
