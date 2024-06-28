class Solution {
    public String largestOddNumber(String num) {
      
        String temp = "";
        String ans = "";
        int n = num.length();

        for(int i=0;i<n;i++)
        {
            char t = num.charAt(i);

            if(isodd(t))
            {
                temp = num.substring(0,i+1);
                if(ans.length()<temp.length())
                {
                    ans = temp;
                }
                temp = "";
            }
        }

    return ans;

    }
    public static boolean isodd(char c)
    {
        if(c=='1' ||c=='3' ||c=='5' ||c=='7' ||c=='9' )
        {
            return true;
        }
        return false;
    }
}
