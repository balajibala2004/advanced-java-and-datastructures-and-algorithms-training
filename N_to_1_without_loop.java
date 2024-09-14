public class Solution
{
    public static int[] printNos(int x) {
        int[] res = new int[x];
		int cnt=0;
		recur(1,x,res,cnt);
        return  res;
        }
        public static void recur(int x,int y,int[] res,int cnt)
	{
		
		if(x>y)
		{
			return;
		}
		
		res[cnt++] = y;
		
		recur(x,y-1,res,cnt);
		
		}

}
