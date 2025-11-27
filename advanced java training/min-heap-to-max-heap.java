
    
    public static void max_heapify(int i,int n , int[] arr)
    {
        int largest = i;
        
        int lc = 2*i+1; ;
        int rc = 2*i+2;
        
        if( lc < n && arr[i]<arr[lc])
        {
          largest = lc;
        }
        
        if( rc < n && arr[largest]<arr[rc])
        {
          largest = rc;
        }
        
        
        
        if(largest !=i)
        {
            int temp = arr[largest];
            arr[largest] = arr[i];
            arr[i] = temp;
            max_heapify(largest,n , arr);
        }
    }
    
    public static void func2(int[] arr)
    {
        int n = arr.length-2;
        for(int i=n/2;i>=0 ;i--)
        {
            max_heapify(i,arr.length,arr);
        }
    }
    
    public static void main(String[] args) {


    int[] arr2 = {10, 20, 30, 21, 32};

    func2(arr2);
    for(int i:arr2)
    {
        System.out.println(i);
    }
    }
}
