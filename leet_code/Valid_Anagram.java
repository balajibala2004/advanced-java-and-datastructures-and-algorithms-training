import java.util.*;

class Solution {
    public boolean isAnagram(String s, String t) {

        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();

        Arrays.sort(str1);
        Arrays.sort(str2);
        for(int i=0;i<s.length();i++)
        {
            if(str1[i]!=str2[i])
            {
                return false;
            }
        }

        return true;

         
    }
}
