class Solution {
    public int reverse(int x) {
        int reverse = 0;
        int rem;
        while(x!=0)
        {
            rem=x%10;
            x = x/10;
            reverse  = reverse*10 + rem;
        }
		
       return  reverse;
    }
}
