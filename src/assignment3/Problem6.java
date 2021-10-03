package assignment3;

public class Problem6 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(){};
        ListNode(int x) {
            val = x;
            next = null;
        }
    }


    /**
     * Time Complexity : O(n)
     * Space Complexity : O(1)
     */
    public ListNode findCycleStart(ListNode head) {
        ListNode fast = head;
        ListNode low = head;
        while(true){
            if(fast == null || fast.next == null) return null;
            fast = fast.next.next;
            low = low.next;
            if(fast == low) break;
        }
        fast = head;
        while(fast != low){
            fast = fast.next;
            low = low.next;
        }
        return fast;
    }


}
