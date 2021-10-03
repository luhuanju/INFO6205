package assignment3;

public class Problem5 {

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
    public ListNode findMid(ListNode head) {

        ListNode slow=head,fast=head;
        while(fast!=null&& fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }


}
