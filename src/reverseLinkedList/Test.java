package reverseLinkedList;

/**
 * Created by Think on 11/4/16.
 */
public class Test {
    public static void main(String[] args){
        Solution solution = new Solution();
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        a.next = b;
        System.out.println(solution.reverseList(a));
    }
}
