import java.util.*;
public class Solution {
    public static List<Long> factorialNumbers(long n) {
       
		 List<Long>  res1 = new ArrayList<>();
		 fact(res1,1,n);
		 return res1;
	
	 
	 
        
    }
    public static void fact(List<Long> res1, long current ,long n)
	 {
		 if(current >n)
		 {
			 return;
		 }
		 res1.add(current);
		 fact(res1,current*(res1.size() + 1), n);
	 }
}
