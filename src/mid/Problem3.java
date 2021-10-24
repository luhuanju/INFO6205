package mid;

public class Problem3 {

    static class ListNode{
        int val;
        ListNode next;
        ListNode(){};
    }

    public ListNode detectCycleAndFindMid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (true) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow ==fast) {
                break;
            }
        }
        slow = head;
        while (true) {
            slow = slow.next;
            fast = fast.next;
            if (slow == fast) {
                break;
            }
        }
        while (fast.next != slow) {
            fast = fast.next;
        }
        fast.next = null;
        ListNode first = head;
        ListNode second = head;
        while (second!=null) {
            first = first.next;
            second = second.next.next;
        }
        return first;
    }
}
