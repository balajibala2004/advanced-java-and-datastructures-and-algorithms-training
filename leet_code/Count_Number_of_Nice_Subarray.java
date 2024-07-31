class Solution {
    public int numberOfSubarrays(int[] nums, int goal) 
    {

    int a =  fun(nums,goal-1);
    int b = fun(nums,goal);
    return (b-a);


        
    }

    public static int fun (int[] nums, int k)
    {
         int n = nums.length;
        int res = 0;
      if(k<0)
      {
        return 0;
      }
        int odd = 0,l=0,r=0,sum=0;
      
       while(r<n)
       {
        sum += nums[r]%2;
        while(sum>k)
        {
            sum -= nums[l]%2;
            l++;
        }

        res += r-l+1;
         r++;
       }        
        return res;
    }
}
