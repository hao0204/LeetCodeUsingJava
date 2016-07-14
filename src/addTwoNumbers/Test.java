package addTwoNumbers;

public class Test {

	public static void main(String[] args) {
		Solution s = new Solution();
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);
		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);
		ListNode t = s.addTwoNumbers(l1, l2);
		System.out.println(t.val + " -> " + t.next.val + " -> " + t.next.next.val);
	}

}
