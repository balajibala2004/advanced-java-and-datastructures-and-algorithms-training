class Solution {
    public int strStr(String haystack, String needle) {
      
        int hl = haystack.length();
        int nl = needle.length();

        for(int i=0;i<hl-nl;i++)
        {
            int j=0;
            while(j<nl && haystack.charAt(i+j)==needle.charAt(j))
            {
                j++;
            }
            if(j==needle.length())
            {
                return i;
            }
        }

        
        return -1;
    }
}
