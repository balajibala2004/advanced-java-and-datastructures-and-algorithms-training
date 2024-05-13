class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;

        int first = -1;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==target)
            {
                first =i;
                break;
            }
        }
int last = -1;
        for(int i=n-1;i>=0;i--)
        {
            if(nums[i]==target)
            {
                last =i;
                break;
            }
        }
    if(first ==-1)
    {
        int arr[] = { -1 , -1};
    }
    int arr[] = {first , last};
    
    return arr;

    }
}
