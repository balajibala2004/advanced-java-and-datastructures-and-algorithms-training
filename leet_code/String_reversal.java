class Solution {
    public String reverseWords(String s) {
    

        s = s.trim();
        String[] res1 =  s.split("\\s+");
       
        StringBuilder res = new StringBuilder();
        

    for(int i = res1.length-1;i>=0;i--)
    {
        

        res.append(res1[i]);

        if(i!=0)
        {
            res.append(" ");
        }

        
    }

    return res.toString();
    }
}
