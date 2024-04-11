
public class Solution {
    public static void bubbleSort(int[] arr, int n) {
        //Your code goes here
        int flag = 0;
        if (n==1)
        {
            return;
        }
            for(int j=0;j<=n-2;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                   // flag = 1;
                }
                
            }

        bubbleSort(arr , n-1);
        
    }

}
