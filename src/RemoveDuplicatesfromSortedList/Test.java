package RemoveDuplicatesfromSortedList;

/**
 * Created by Think on 11/10/16.
 */
public class Test {
	public static void main(String[] args){
		Solution solution = new Solution();
		ListNode a = null;
		ListNode b = new ListNode(1);
		ListNode c = new ListNode(1);
//		a.next = b;
//		b.next = c;
        solution.deleteDuplicates(a);
		while(a != null) {
            System.out.println(a.val);
            a = a.next;
        }
	}
}
