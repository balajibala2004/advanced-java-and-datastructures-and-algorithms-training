import java.util.*;

class Solution {
    public boolean isIsomorphic(String s, String t){
        if(s.length() != t.length())
        {
            return false;
        }

        HashMap<Character,Character> hm = new HashMap<>();

        int n = s.length();

        for(int i=0;i<s.length();i++)
        {
            char c1 = s.charAt(i) , c2 = t.charAt(i);
            if(hm.containsKey(c1))
            {
                if(hm.get(c1)!=c2)
                {
                    return false;
                }
            }
            else 
            {
                if(hm.containsValue(c2))
                {
                    return false;
                }
                hm.put(c1,c2);
            }
        }

        return true;
        
    }
}
