class Solution {


    static int capacity = 20;
    static int size;
    static int[] arr;

    static int left(int i)
    {
        return (2*i)+1;
    }

    static int right(int i)
    {
        return (2*i)+2;
    }

    static int parent(int i)
    {
        return (i-1)/2;
    }

    public void initializeHeap() {
        size = 0;
        arr = new int[capacity];
    }

    public void insert(int key) {
        if(size == capacity)
        {
            System.out.println("overflow error");
            return;
        }
        arr[size] = key;
        int k = size;
        size++;
        
        while(k !=0 && arr[parent(k)]>arr[k])
        {
            int temp = arr[k];
            arr[k] = arr[parent(k)];
            arr[parent(k)] = temp;
            k=parent(k);
        }
    }

    static void Heapify(int i)
    {



        int smallest = i;

        int lc = left(i);

        int rc = right(i);

        if(lc < size && arr[lc]<arr[smallest])
        {
            smallest = lc;
        }

        if(rc < size && arr[rc]<arr[smallest])
        {
            smallest = rc;
        }

        int k = smallest;
   

        if(smallest != i)
        {

            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
            Heapify(smallest);
 
        }
        
        
    }

    public void changeKey(int index, int newVal) {

        int oldval = arr[index];
        arr[index] = newVal;
        
        if(oldval>newVal)
        {
            
        while(index!=0 && arr[parent(index)] > arr[index])
        {
            int temp = arr[parent(index)];
            arr[parent(index)] = arr[index];
            arr[index] = temp;
            index = parent(index);
        }
    }
    else{
        Heapify(index);
    }
        
    }

    public void extractMin() {

        if(size<=0)
        {
            return;
        }
        // if(size ==1)
        // {
        //     size --;
        //     return ;
        // }

        arr[0] = arr[size-1];
        size--;
        Heapify(0);
        
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public int getMin() {
       return arr[0];
    }

    public int heapSize() {
        return size;
        
    }
    public static void main(String[] args) {

        // Create object of Solution
        Solution heap = new Solution();

        // ----------- Test Case 1 -----------
        String[] operations = {
                "initializeheap", "insert", "insert", "insert",
                "getMin", "heapSize", "isEmpty",
                "extractMin", "changeKey", "getMin"
        };

        int[][] nums = {
                {},     // initializeheap
                {4},    // insert 4
                {1},    // insert 1
                {10},   // insert 10
                {},     // getMin
                {},     // heapSize
                {},     // isEmpty
                {},     // extractMin
                {0,16}, // changeKey(0,16)
                {}      // getMin
        };

        for(int i = 0; i < operations.length; i++) {

            switch (operations[i]) {

                case "initializeheap":
                    heap.initializeHeap();
                    System.out.println("null");
                    break;

                case "insert":
                    heap.insert(nums[i][0]);
                    System.out.println("null");
                    break;

                case "getMin":
                    System.out.println(heap.getMin());
                    break;

                case "heapSize":
                    System.out.println(heap.heapSize());
                    break;

                case "isEmpty":
                    System.out.println(heap.isEmpty() ? 1 : 0);
                    break;

                case "extractMin":
                    heap.extractMin();
                    System.out.println("null");
                    break;

                case "changeKey":
                    heap.changeKey(nums[i][0], nums[i][1]);
                    System.out.println("null");
                    break;
            }
        }
    }
}
