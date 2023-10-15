class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode list=new ListNode(0);
        ListNode head=list;
        int rem=0;
        int sum=0;
        while(l1!=null && l2!=null)
        {
            sum=(l1.val+l2.val+rem);
            rem=sum/10;
            list.next=new ListNode(sum%10);
            l1=l1.next;
            l2=l2.next;
            list=list.next;
            
        }
        while(l1!=null)
        {
            sum=(l1.val+rem);
            rem=sum/10;
            list.next=new ListNode(sum%10);
            l1=l1.next;
            list=list.next;
           
           
        }
        while(l2!=null)
        {
            sum=(l2.val+rem);
            rem=sum/10;
            list.next=new ListNode(sum%10);
           
            l2=l2.next;
            list=list.next;
        }
        if(rem!=0)
        {
            list.next=new ListNode(rem);
        }
       return head.next;
        
    }
}
       
      
