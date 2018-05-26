

public class PartitionList {

	class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	 }
	
    public ListNode partition(ListNode head, int x) {
    	
    	    if(head==null || head.next==null)
    		    return head;
        
    	    ListNode list1, list2;
        list1 = new ListNode(0);
        list2 = new ListNode(0);
        ListNode small, great, current;
        small = list1;
        great = list2;
        current = head;
        
        while(current!=null)
        {
        	if(current.val<x)
        	{
        		small.next = current;
        		small = current;
        	}
        	
        	if(current.val>x)
        	{
        		great.next = current;
        		great = current;
        	}
        }
        
        small.next = list2.next;
        great.next = null;
        
        return list1.next;
    }
}
