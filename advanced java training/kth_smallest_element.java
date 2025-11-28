import java.util.PriorityQueue;
import java.util.Collections;

class Main {
    
    // space complexity : o(k)
    // time complexity : o(n log k)
    
    public static void func(int[] arr, int k)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
       
        
        for(int i=0;i<k;i++)
        {
            pq.add(arr[i]);
        }
        
        for(int i=k;i<=arr.length-1;i++)
        {
            if(arr[i] > pq.peek())
            {
                pq.poll();
                pq.add(arr[i]);
            }
        }
        
        System.out.println(pq.peek());
        
    }
   
    
    
    
    
    public static void main(String[] args) {
       int[] nums = {-5, 4, 1, 2, -3};
       int k = 5;
       func(nums,k);
    }
}
