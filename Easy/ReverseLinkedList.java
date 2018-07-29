public class ReverseLinkedList {

	static Node1 head;
	
	public static Node1 reverse(Node1 head)
	{
		Node1 cur = head, prev = null, next1=head;
		
		while(next1!=null)
		{
			next1 = cur.next;
			cur.next = prev;
			prev = cur;
			cur = next1;	
		}
		head = prev;
		return head;
	}
}
