package terry;

import java.util.Objects;

public class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListNode listNode = (ListNode) o;
        return val == listNode.val && Objects.equals(next, listNode.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(val, next);
    }

    @Override
    public String toString() {
        ListNode listNode = this;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[ ");
        stringBuilder.append(listNode.val);
        while (listNode.next != null) {
            listNode = listNode.next;
            stringBuilder.append(", ").append(listNode.val);
        }
        stringBuilder.append(" ]");
        return stringBuilder.toString();
    }
}