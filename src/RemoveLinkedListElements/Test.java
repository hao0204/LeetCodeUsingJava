package RemoveLinkedListElements;

/**
 * Created by Think on 2/5/17.
 */
public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode a1 = new ListNode(6);
        ListNode a2 = new ListNode(6);
        ListNode a3 = new ListNode(4);
        ListNode a4 = new ListNode(6);
        ListNode a5 = new ListNode(6);
        ListNode a6 = new ListNode(6);
        ListNode a7 = new ListNode(6);
        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        a4.next = a5;
        a5.next = a6;
        a6.next = a7;

        ListNode t = solution.removeElements(a1, 6);
        while(t != null) {
            System.out.println(t.val);
            t = t.next;
        }
    }
}
