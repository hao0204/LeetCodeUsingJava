package swapNodesinPairs;

public class Test {

	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		l1.next = l2;
		Solution solution = new Solution();
		System.out.println(solution.swapPairs(l1));
	}

}
