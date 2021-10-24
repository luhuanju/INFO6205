package mid;

public class Problem3 {

    static class ListNode{
        int val;
        ListNode next;
        ListNode(){};
    }

    public ListNode detectCycleAndFindMid(ListNode head) {
        if (head == null || head.next==null) return null;
        ListNode fast = head;
        ListNode slow = head;
        while (fast!=null) {
            fast = fast.next;
            if (fast!=null) {
                fast = fast.next;
                slow = slow.next;
            }
            if (fast == slow) {
                break;
            }
        }
        if (fast == null) return null;
        fast = head;
        while (fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }
        return fast;
    }
}
