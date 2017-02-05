package IntersectionofTwoLinkedLists;

/**
 * Created by Think on 2/5/17.
 */
public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);
        ListNode c1 = new ListNode(3);
        ListNode c2 = new ListNode(4);
        ListNode c3 = new ListNode(5);
        ListNode b1 = new ListNode(6);
        ListNode b2 = new ListNode(7);
        ListNode b3 = new ListNode(8);
        a1.next = a2;
        a2.next = c1;
        c1.next = c2;
        c2.next = c3;
        b1.next = b2;
        b2.next = b3;
        b3.next = c1;
        System.out.println(solution.getIntersectionNode(a1, b1));
    }
}
