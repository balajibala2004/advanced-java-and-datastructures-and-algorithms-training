class Solution {
    public String removeOuterParentheses(String s) {
        

        StringBuilder res = new StringBuilder();

        char[] arr = s.toCharArray();

        int br=0;

        for(char c : arr)
        {
            if(c=='(')
            {
                if(br>0)
                {
                    res.append(c);
                }
                br++;
            }
            else if(c==')')
            {
                br--;
                if(br>0)
                {
                    res.append(c);
                }
            }
        }


        return res.toString();

        
    }
}
