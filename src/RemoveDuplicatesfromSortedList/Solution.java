package RemoveDuplicatesfromSortedList;

/**
 * Created by Think on 11/10/16.
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        ListNode list = head;
        while(list.next != null){
            if (list.val == list.next.val){
            	list.next = list.next.next;
            } else {
            	list = list.next;
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
