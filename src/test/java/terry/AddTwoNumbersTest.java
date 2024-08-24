package terry;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AddTwoNumbersTest {

    ListNode build(int... digits) {
        ListNode firstNode = null;
        ListNode previousNode = null;
        ListNode listNode;
        for (int digit : digits) {
            listNode = new ListNode(digit);
            if (firstNode == null) {
                firstNode = listNode;
            }
            if (previousNode != null) {
                previousNode.next = listNode;
            }
            previousNode = listNode;
        }
        return firstNode;
    }

    @Test
    void addTwoNumbersTest0() {
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode l1 = build(2, 4, 3);
        ListNode l2 = build(5, 6, 4);
        ListNode expectedOutput = build(7, 0, 8);

        ListNode actualOutput = addTwoNumbers.addTwoNumbers(l1, l2);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void addTwoNumbersTest1() {
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode l1 = build(0);
        ListNode l2 = build(0);
        ListNode expectedOutput = build(0);

        ListNode actualOutput = addTwoNumbers.addTwoNumbers(l1, l2);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void addTwoNumbersTest2() {
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode l1 = build(9, 9, 9, 9, 9, 9, 9);
        ListNode l2 = build(9, 9, 9, 9);
        ListNode expectedOutput = build(8, 9, 9, 9, 0, 0, 0, 1);

        ListNode actualOutput = addTwoNumbers.addTwoNumbers(l1, l2);

        assertEquals(expectedOutput, actualOutput);
    }
}