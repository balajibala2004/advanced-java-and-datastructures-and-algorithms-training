class Solution
{
    //Function to insert a node at the beginning of the linked list.
    Node insertAtBeginning(Node head, int x)
    {
        // code here
        
        
        
        Node newn = new Node(x);
       // newn.data = x;
        newn.next = head;
        head = newn;
        
        return head;
        
    }
    
    //Function to insert a node at the end of the linked list.
    Node insertAtEnd(Node head, int x)
    {
        Node newn1 = new Node(x); 
        if(head == null)
    {
            head = newn1;
            return head;
        }
        // code here
        Node temp = head;
        while(temp.next!=null)
        {
            temp = temp.next;
        }
        
        
        temp.next = newn1;
        
        return head;
        
    }
}
