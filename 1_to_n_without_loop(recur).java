public class Solution {
    public static int[] printNos(int x){
    
     int[]ans =new int[x];
	    

    recur(x, ans);
		

    return ans;
}

	public static void recur(int x , int[] ans)
{
        if(x==0)
		{
			return;
	}
		recur(x-1, ans);
		
		ans[x-1] = x;
    }
}
