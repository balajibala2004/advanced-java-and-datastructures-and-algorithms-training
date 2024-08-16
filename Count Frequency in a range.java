import java.util.Arrays;
public class Solution {

       public static void main(String[] args){
	
	int[] arr = {1,3,4,3,4,1};

	int[] res = countFrequency(6,4,arr);
	
	//System.out.println(Arrays.toString(res));
	
	}	
	

     
	 public static int[] countFrequency(int n, int x, int []nums){
	        // Write your code here.
		 int[] arr = new int[x+1];
		 
		 for(int i:nums)
	{
			 arr[i]++;
		 }
		 return Arrays.copyOfRange(arr, 1, n+1);
	    }
    }
import java.util.Arrays;
public class Solution {

       public static void main(String[] args) {
	
	int[] arr = {1,3,4,3,4,1};

	int[] res = countFrequency(6,4,arr);
	
	//System.out.println(Arrays.toString(res));
	
	}	
	

     
	 public static int[] countFrequency(int n, int x, int []nums){
	        // Write your code here.
		 int[] arr = new int[x+1];
		 
		 for(int i:nums)
		 {
			 arr[i]++;
		 }
		 return Arrays.copyOfRange(arr, 1, n+1);
	    }
    }
