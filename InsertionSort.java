public class Solution {
    public static void insertionSort(int[] arr, int size) {
        //Your code goes here
        int n = size;
        for(int i =0;i<n;i++)
            
 {
            int j=i;
            while(j > 0 && arr[j-1]>arr[j])
            {
                
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }
}
