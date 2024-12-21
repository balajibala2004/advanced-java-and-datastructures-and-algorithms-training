class Solution {
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {
        // code here
        
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        
        // Initialize pointers
        Node left = head;
        Node right = head;
        
        // Move the right pointer to the end of the list
        while (right.next != null) {
            right = right.next;
        }
        
        // Traverse the list to find pairs with the given sum
        while (left.data < right.data )
        {
            int sum = left.data + right.data;
            
            if (sum == target) {
                // If the sum matches, add the pair to the result list
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(left.data);
                pair.add(right.data);
                result.add(pair);
                
                // Move both pointers
                left = left.next;
                right = right.prev;
            } else if (sum < target) {
                // Move the left pointer forward if the sum is less than the target
                left = left.next;
            } else {
                // Move the right pointer backward if the sum is greater than the target
                right = right.prev;
            }
        }
        
        return result;
    
    }
}
        
