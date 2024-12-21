class Solution{
    Node removeDuplicates(Node head){
        // Code Here.
        
        Node temp = head;
        
        while(temp!=null &&temp.next!=null)
        {
            Node newnode = temp.next;
            
            while(newnode!=null  && newnode.data == temp.data )
            {
                newnode = newnode.next;
            }
            
            temp.next = newnode;
            if(newnode!= null) 
            {
                newnode.prev = temp;
            }
            temp = temp.next;
        }
        
        return head;
    }
}
