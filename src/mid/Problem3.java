package mid;

public class Problem3 {

    static class ListNode{
        int val;
        ListNode next;
        ListNode(){};
    }





    public ListNode mid(ListNode head) {

        ListNode dummy=new ListNode();
//        dummy.next=head;


        ListNode slow = head;
        ListNode fast = head;
        //first find cycle
        while (true) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow ==fast) {
                break;
            }
        }
        //mid
        slow = head;
        while (true) {
            slow = slow.next;
            fast = fast.next;
            if (slow == fast) {
                // break the mid
                break;
            }
        }
        while (fast.next != slow) {
            fast = fast.next;
        }
        fast.next = null;
        ListNode l1 = head;
        ListNode l2 = head;
        while (l2!=null) {
            l1 = l1.next;
            l2 = l2.next.next;
        }
        return l1;
    }



    /**
     * T : O(n) : for loop cycle and find mid
     * S : O(1) :
     */
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
