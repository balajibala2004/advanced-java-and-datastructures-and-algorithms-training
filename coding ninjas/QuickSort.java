
public class Solution {
	
	public static void quickSort(int[] input,int startIndex, int endIndex) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * No need to print or return the output.
		 * Taking input and printing output is handled automatically.
		 */
		 //int arr = input;
		 int low = startIndex;
		 int high = endIndex;
		 if(low<high)
		 {
			 int pindex = partition(input,low,high);
			 quickSort(input,low,pindex-1);
			 quickSort(input,pindex+1,high);
		 }
		
	}
	static int partition(int[] arr,int low,int high)
	{
		int pivot = arr[low];
		int i = low;
		int j = high;

		while(i<j)
		{
			while(arr[i]<=pivot && i<=high-1)
			{
				i++;
			}
			while(arr[j]>pivot && j>=low+1)
			{
				j--;
			}
			if(i<j)
			{
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}

		}
		int temp = arr[low];
		arr[low] = arr[j];
		arr[j] = temp;
		return j;
	}
	
}
