package lintcode.listnode;

/**
 * Created by liujianmeng on 16/9/22.
 */
public class MergeListNodes {
    /**
     * @return: ListNode head of linked list
     */
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        return helper(l1, l2);
    }


    public static ListNode helper(ListNode l1, ListNode l2) {
        ListNode result;
        ListNode l1Temp = new ListNode(0);
        ListNode l2Temp = new ListNode(0);
        if (l1 == null && l2 == null) return null;
        if (l1 == null && l2 != null) return l2;
        if (l1 != null && l2 == null) return l1;
        if (l1.val > l2.val) {
            l2Temp = l2.next;
            l2.next = l1;
            result = l2;
        } else {
            l1Temp = l1.next;
            l1.next = l2;
            result = l1;
        }
        helper(l1Temp, l2Temp);
        return result;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(10);
        ListNode l2 = new ListNode(8);
        mergeTwoLists(l1,l2);
    }
}
