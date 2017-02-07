package RemoveLinkedListElements;

/**
 * Created by Think on 2/5/17.
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val)
            head = head.next;
        if (head == null) return null;
        ListNode p1 = head;
        ListNode p2 = p1.next;
        while (p2 != null){
            ListNode mid = p2;
            p2 = p2.next;
            if (mid.val == val) {
                p1.next = p2;
            } else {
                p1 = p1.next;
            }
        }
        return head;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
