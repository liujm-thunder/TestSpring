package lintcode.listnode;

/**
 * Created by liujianmeng on 16/9/20.
 */
public class AddListNode {
    /**
     * @param l1: the first list
     * @param l2: the second list
     * @return: the sum list of l1 and l2
     */
    public static ListNode addLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode l1Temp = l1;
        ListNode l2Temp = l2;
        ListNode longer, shorter;
        int length1 = 0, length2 = 0, carry = 0, temp = 0;
        while (l1Temp != null) {
            length1++;
            l1Temp = l1Temp.next;
        }

        while (l2Temp != null) {
            length2++;
            l2Temp = l2Temp.next;
        }

        if (length2 > length1) {
            longer = l2;
            shorter = l1;
        } else {
            longer = l1;
            shorter = l2;
        }
        l1Temp = longer;
        l2Temp = shorter;

        while (l1Temp != null && l2Temp != null) {
            if (carry != 0) {
                temp = l1Temp.val + l2Temp.val + carry;
                carry = 0;
            } else {
                temp = l1Temp.val + l2Temp.val;
            }
            if (temp > 9) {
                carry = temp / 10;
                l1Temp.val = temp % 10;
            } else {
                l1Temp.val = temp;
            }

        }

        if (carry != 0) {
            while (l1Temp.val != 0) {
                temp = l1Temp.val + carry;
                carry = temp / 10;
                l1Temp.val = temp % 10;
                l1Temp = l1Temp.next;
            }
            if (carry != 0) {
                ListNode newNode = new ListNode(carry);
                l1Temp = longer;
                while (l1Temp.next != null)
                    l1Temp = l1Temp.next;
                l1Temp.next = newNode;
            }

        }
        return longer;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(9);
        ListNode l2 = new ListNode(8);
        addLists(l1, l2);
    }
}
