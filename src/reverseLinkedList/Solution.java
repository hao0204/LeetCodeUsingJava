package reverseLinkedList;

/**
 * Created by Think on 11/4/16.
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        if (head != null && head.next != null){
            ListNode a = head, b;
            while(a != null && a.next != null){
                b = a.next;
                a.next = a.next.next;
                b.next = head;
                head = b;
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
