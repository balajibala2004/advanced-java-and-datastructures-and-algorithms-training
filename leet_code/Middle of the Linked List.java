class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;


        int count = 0;
        while(temp!=null)
        {
            count++;
            temp = temp.next;
        }

        System.out.println(count);

       
        int  res = count/2;
         res++;
        
        for(int i = 0;i<res-1;i++)
        {
           head = head.next; 
        }
        return head;
    }
}
