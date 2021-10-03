package assignment3;

public class Problem1 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    /**
     * Time Complexity : O(n)
     * Space Complexity : O(1)
     */

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode nodeA=headA,nodeB=headB;
        while(headA!=headB){
            headA= headA==null?nodeB: headA.next;
            headB= headB==null?nodeA: headB.next;
        }
        return headA;
    }



}
