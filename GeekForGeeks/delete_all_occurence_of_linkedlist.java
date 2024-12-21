class Solution {
    static Node deleteAllOccurOfX(Node head, int x) {
        // Write your code here
        
        if (head == null) {
            return null;
        }
        
        Node temp = head;
        
        while(temp!=null)
        {
            if(temp.data==x)
            {
                if(temp==head)
                {
                    head = temp.next;
                    // if (head != null) {
                    //     head.prev = null;
                    // }
                }
                
                Node prev = temp.prev;
                Node next = temp.next;
                
                if(prev!= null)
                {
                    prev.next = next;
                    
                }
                if(next!=null)
                {
                    next.prev = prev;
                }
                temp = next;
            }
            else
            {
                temp = temp.next;
            }
        }
        
        return head;
    }
