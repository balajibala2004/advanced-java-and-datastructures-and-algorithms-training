class Solution
{
    public int[] common_digits(int[] nums)
    {
        // code here
        Map<Integer,Integer> mp = new TreeMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int num = nums[i];
            
            while(num!=0)
         {
                int t = num%10;
                mp.put(t ,mp.getOrDefault(t,0)+1);
                
                num/=10;
            }
        }
        int[] arr = new int[mp.size()];
        int i = 0;
        for(Map.Entry<Integer,Integer> it : mp.entrySet())
        {
            int t = it.getKey();
            arr[i++] = t;
        }
        
        return arr;
    }
}
