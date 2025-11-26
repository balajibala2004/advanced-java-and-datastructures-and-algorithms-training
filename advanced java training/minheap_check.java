// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    
    
    public static boolean func(int[] arr)
    {
        int  n = arr.length;
        
        //to check binary tree there is no need to check leaf nodes they doesnot have children
        for(int i=0;i<n/2-1;i++)
        {
            int lc = 2*i+1;
            int rc = 2*i+2;
            
            if(( lc < n && arr[i]>arr[lc]) || ( rc < n && arr[i]>arr[rc]))
            {
                return false;
            }

        }
        return true;
    }
    
    
    
    public static void main(String[] args) {


    int[] arr = {10, 20, 30, 21, 23};
    int[] arr2 = {0, 20, 30, 25, 15};
    boolean result = func(arr);
    
    System.out.println(result);
    }
}
