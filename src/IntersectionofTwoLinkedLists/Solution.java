package IntersectionofTwoLinkedLists;

/**
 * Created by Think on 2/5/17.
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode a = headA;
        ListNode b = headB;
        int lengthA = 1;
        int lengthB = 1;
        while(a.next != null) {
            a = a.next;
            ++lengthA;
        }
        while(b.next != null) {
            b = b.next;
            ++lengthB;
        }
        if(a != b)
            return null;
        if(lengthA > lengthB)
            return getIndex(headB, headA, lengthB, lengthA);
        else
            return getIndex(headA, headB, lengthA, lengthB);
    }

    public ListNode getIndex(ListNode headA, ListNode headB, int lengthA, int lengthB) {
        ListNode a = headA;
        ListNode b = headB;
        int interval = lengthB - lengthA;
        while (interval-- > 0)
            b = b.next;
        while(true){
            if (a == b)
                return a;
            else {
                a = a.next;
                b = b.next;
            }
        }
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }

    @Override
    public String toString() {
        return ""+val;
    }
}
