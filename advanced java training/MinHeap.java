

class BinaryHeap {
    
    static int size;
    static int capacity;
    static int[] arr;
    
    BinaryHeap(int cap)
    {
        capacity = cap;
        size = 0;
        arr = new int[capacity];
    }
    
    
    static int parent(int i)
    {
        return (i-1)/2;
    }
    
     static int left(int i)
    {
        return (2*i)+1;
    }
    
    static int right(int i)
    {
        return (2*i)+2;
    }
    
    static void Insert(int x)
    {
        if(size ==capacity)
        {
            System.out.println("Binary Heap Overflown");
      return;
        }
        arr[size] = x;
        int k = size;
        
        size++;
        
        while(k!=0 && arr[parent(k)] > arr[k])
        {
            int temp = arr[parent(k)];
            arr[parent(k)] = arr[k];
            arr[k] = temp;
            k = parent(k);
        }
    }
    
    static void print()
    {
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i] + " ");
            
        }
        System.out.println();
    }
    
    
    static void DecreaseKey(int i,int val)
    {
        arr[i] = val;
        
        while(i!=0 && arr[parent(i)]>arr[i])
        {
             int temp = arr[parent(i)];
      arr[parent(i)] = arr[i];
      arr[i] = temp;
            i = parent(i);
        }
    }
    
    
    static int getMin()
    {
        return arr[0];
    }
    
    
    static void Heapify(int ind)
    {
        
        int smallest = ind;
        
        int li = left(ind);
        int ri = right(ind);
        
        if( li <size &&  arr[li]<arr[smallest])
        {
            smallest = li;
        }
        
        if( ri <size &&  arr[ri]<arr[smallest])
        {
            smallest = ri;
        }
        
        if(smallest != ind)
        {
            int temp = arr[ind];
            arr[ind] = arr[smallest];
            arr[smallest] = temp;
            Heapify(smallest);
        }
        
    }
    
    
    
    
    
    
    static int ExtractMin()
    {
        if(size<=0)
        {
            return Integer.MAX_VALUE;
        }
        if(size == 1)
        {
            size --;
            return arr[0];
        }
        
        int mini = arr[0];
        
        arr[0] = arr[size -1];
        
        Heapify(0);
        
        return mini;
    }
    
    
    
    static void Delete(int i)
    {
        DecreaseKey(i,Integer.MIN_VALUE);
        ExtractMin();
    }
    
    
    
    public static void main(String[] args) {
       BinaryHeap h = new BinaryHeap(20);
       
       h.Insert(4);
       h.Insert(1);
       h.Insert(2);
       h.Insert(6);
       h.Insert(7);
       h.Insert(3);
       h.Insert(8);
       h.Insert(5);

        h.print();
        
        h.Insert(-1);
            System.out.println("Min value is " + h.getMin());
        
        
        h.print();
        
        
        
        
        
    }
}
