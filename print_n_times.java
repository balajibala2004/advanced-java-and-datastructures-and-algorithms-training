import java.util.*;
public class Solution {
    public static List<String> printNtimes(int n){
        // Write your code here.
        List<String> result = new ArrayList<>();
		recur(1,n, result);
        return result;
}

    public static void recur(int x,int y , List<String> result)
{
		if(x>y)
		{
			return;
}
		result.add("Coding Ninjas");
		recur(x+1,y , result);
}

    
}
