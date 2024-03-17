public class Solution {
   public static int[] reverseArray(int n, int []nums) {
	        // Write your code here.
		 
		 recur(nums ,n ,0);
		 return nums;
	    
	    }
	 
	 public static void recur(int[] arr , int n , int i )
	 {
		 if(i>=n/2)
		 {
			 return ;
		 }
	swap(i,(n-i-1), arr);
		 
	 recur(arr,n,i+1);
	 }
	 public static void swap(int a ,int b,int[] arr)
	 {
		 int temp =arr[a];
		 arr[a]=arr[b];
		 arr[b]=temp;
	 }
}
