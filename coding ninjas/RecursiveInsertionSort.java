public class Solution {
    public static void insertionSort(int[] arr, int size) {
        //Your code goes here
        int n = size;
        int i =0;
        RinsertionSort( arr, i,n);
    }

    public static void RinsertionSort(int[] arr,int i, int n)
    {
        
        if(i==n)
        {
            return;
        }
         int j=i;
            while(j > 0 && arr[j-1]>arr[j])
            {
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }

    RinsertionSort( arr, i+1,n);
    }
}
