package LinkedListCycle;

/**
 * Created by Think on 12/1/16.
 */
public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        ListNode f = new ListNode(6);
//        a.next = b;
//        b.next = c;
//        c.next = d;
//        d.next = b;
//        e.next = f;
        System.out.println(solution.hasCycle(a));
    }
}
