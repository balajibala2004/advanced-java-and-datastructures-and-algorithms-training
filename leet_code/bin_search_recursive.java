class Solution {
    public int search(int[] nums, int target) {

        
        return binary_search(nums,target , 0, nums.length-1);
    }

    public static int binary_search(int[] nums , int target , int low ,int high)
    {
        if(low>high) return -1;

        int mid = (low +  high) /2;
         if(target == nums[mid]) return mid;
         else if(target < nums[mid]) 
            return binary_search(nums, target, low, mid - 1);
         return binary_search(nums , target,  mid + 1,  high);

    }
}
