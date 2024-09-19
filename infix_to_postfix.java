
class Solution {
    // Function to convert an infix expression to a postfix expression.
    public static String infixToPostfix(String exp) {
        // Your code here
        
        Stack<Character> st = new Stack<>();
        String result = new String("");
        for(int i=0;i<exp.length();i++)
        {
            char c = exp.charAt(i);
            
            if(Character.isLetterOrDigit(c))
            {
                result+= c;
            }
            else if(c == '(')
     {
                st.push(c);
            }
            else if(c == ')')
            {
                while(!st.isEmpty() && st.peek()!='(')
                {
                    result += st.pop();
                }
                st.pop();
            }
            else
            {
                while(!st.isEmpty() && prec(c)<=prec(st.peek()))
                {
                    result+=st.pop();
                }
                st.push(c);
            }}
            
            while(!st.isEmpty())
            {
                if(st.peek() =='(')
                    return "Invalid Expression";
                result+=st.pop();
            }
            return result;
        }
         public static int prec(char c)
    {
        switch(c)
        {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
                
        }
        return -1;
    }
        
        
        
    }
    
   
   
