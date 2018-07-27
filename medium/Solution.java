
public class Solution {

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode dummy = new ListNode(0);
        ListNode p = dummy, p1 = l1, p2 = l2;
        int carrier = 0;
        while (p1 != null || p2 != null || carrier != 0) {
            int sum = 0;
            if (p1 != null) {
                sum += p1.val;
                p1 = p1.next;
            }
            if (p2 != null) {
                sum += p2.val;
                p2 = p2.next;
            }
            sum += carrier;
            p.next = new ListNode(sum % 10);
            p = p.next;
            carrier = sum / 10;
        }
        return dummy.next;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
