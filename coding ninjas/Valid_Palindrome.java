class Solution {
    public boolean isPalindrome(String str) {
        
    str = str.toLowerCase();
		str = str.replaceAll("[^a-z0-9]","");
		
		 int n = str.length();
		 boolean b = recur(str ,n ,0);
		 
		 return b;
	    
	}
	 
	 public static boolean recur(String arr , int n , int i )
	 {
		 if(i>=n/2)
		 {
			 
			 return true;
		 }
		 if(arr.charAt(i) != arr.charAt(n-i-1))
		 {
			return false;
		 }
		 
	 return recur(arr,n,i+1);
	 }
}
