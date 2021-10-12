package asgignment4;

public class Problem5 {


      public class ListNode {
          int val;
         ListNode next;
         ListNode(int x) { val = x; }
      }



    /**
     * Time Complexity : O(n)
     * Space Complexity : O(1)
     */
    public int getDecimalValue(ListNode head) {
        int sum = 0;
        while(head!=null){
            sum = (2*sum)+head.val;
            head = head.next;
        }
        return sum;
    }
}
