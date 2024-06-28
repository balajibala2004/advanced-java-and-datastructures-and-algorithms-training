class Solution {
    public boolean rotateString(String s, String g) {

        // char[] a = s.toCharArray();
        // char[] b = g.toCharArray();

        int n = s.length();
        char a1 = s.charAt(0);
        int t = -1;
        for(int i=0;i<n;i++)
        {
            if(a1==g.charAt(i))
            {
                t = i;
                break;
            }
        }
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)!=g.charAt(t=t%5))
            {
                return false;
            }
            t++;
        }

        return true;
    }
}
