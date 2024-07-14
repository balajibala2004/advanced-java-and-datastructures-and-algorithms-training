class MyQueue {

    Stack<Integer> ip;
    Stack<Integer> op;

    public MyQueue() {
        ip = new Stack<>();
        op = new Stack<>();
    }
    
    public void push(int x) {

        while(!ip.empty())
        {
            op.push(ip.pop());
        }
        ip.add(x);
        while(!op.empty())
        {
            ip.push(op.pop());
        }

    }
    
    public int pop() {

        

        return ip.pop();
    }
    
    public int peek() {
        return ip.peek();
    }
    
    public boolean empty() {

        return ip.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
