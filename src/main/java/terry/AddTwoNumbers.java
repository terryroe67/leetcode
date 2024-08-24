package terry;

/**
 * Add Two Numbers [Medium]
 * <p>
 * You are given two non-empty linked lists representing
 * two non-negative integers. The digits are stored in
 * reverse order, and each of their nodes contains a
 * single digit. Add the two numbers and return the sum
 * as a linked list.
 * <p>
 * You may assume the two numbers do not contain any
 * leading zero, except the number 0 itself.
 */
public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = null, current = null, empty = new ListNode(0);
        int carry = 0;
        do {
            ListNode listNode = new ListNode((l1.val + l2.val + carry) % 10);
            if (result != null) {
                current.next = listNode;
            } else {
                result = listNode;
            }
            current = listNode;
            carry = (l1.val + l2.val + carry) / 10;
            l1 = l1.next != null ? l1.next : empty;
            l2 = l2.next != null ? l2.next : empty;
        } while (l1 != empty || l2 != empty || carry != 0);
        return result;
    }
}