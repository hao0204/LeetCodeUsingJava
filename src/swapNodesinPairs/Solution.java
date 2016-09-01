package swapNodesinPairs;

class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { val = x; }
}
public class Solution {
	 
	public ListNode swapPairs(ListNode head) {
		if (head == null || head.next == null)
			return head;
		ListNode l1 = head;
		ListNode l2 = head.next;
		ListNode l3 = l2.next;
		l2.next = l1;
		l1.next = swapPairs(l3);
		return l2;
	}
}
