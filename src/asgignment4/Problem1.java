package asgignment4;

public class Problem1 {


      public class ListNode {
          int val;
         ListNode next;
         ListNode(int x) { val = x; }
      }


    /**
     * Time Complexity : O(n)
     * Space Complexity : O(1)
     */
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

}
