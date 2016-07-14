package addTwoNumbers;

//Definition for singly-linked list.
class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { val = x; }
 }

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    	ListNode sum = new ListNode(0);
    	ListNode p = l1;
    	ListNode q = l2;
    	ListNode r = sum;
    	int carry = 0;
    	while(p != null || q != null){
    		int d1 = p != null ? p.val : 0;
    		int d2 = q != null ? q.val : 0;
    		d1 += carry + d2;
    		carry = d1 / 10;
    		r.next = new ListNode(d1 % 10);
    		r = r.next;
    		if (p != null)
    			p = p.next;
    		if (q != null)
    			q = q.next;
    	}
    	if (carry == 1)
    		r.next = new ListNode(1);
    	return sum.next;
    }
}