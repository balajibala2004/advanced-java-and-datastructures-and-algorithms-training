class Solution {
    public int search(int[] nums, int target) {

        int s = nums.length;

        int low = nums[0];
        int high = nums[s-1];
        

        while(low<=high)
        {

            int mid = (low +high)/2;
            if(target == nums[mid])
            { 
              
                return mid;
            }

            else if(target < nums[mid]) high = nums[mid]-1;
           

            else low = nums[mid]+1;
            
        }
       
            return -1;
        

        
    }
}
