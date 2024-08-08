
class Solution{
    public static int totalFruits(Integer[] fruits) 
    {
      int left = 0; 
        int right = 0;
        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        while(right<fruits.length){
            map.put(fruits[right], map.getOrDefault(fruits[right], 0)+1);
            while(map.size() > 2){
                map.put(fruits[left], map.get(fruits[left])-1);
                if(map.get(fruits[left]) == 0){
                    map.remove(fruits[left]);
                }
                left++;
            }
            ans = Math.max(ans, right - left + 1);
            right++;
        }
        
        return ans;
    }
}
