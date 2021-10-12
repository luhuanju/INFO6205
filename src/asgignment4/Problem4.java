package asgignment4;

public class Problem4 {

      public class ListNode {
          int val;
         ListNode next;
         ListNode(int x) { val = x; };
         ListNode(){};
      }


    /**
     * Time Complexity : O(n)
     * Space Complexity : O(1)
     */
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode list = new ListNode();
        list.next = head;
        ListNode start = list;
        ListNode end = list;

        for (int i = 0; i < left - 1; i++) {
            start = start.next;
        }
        for (int i = 0; i < right; i++) {
            end = end.next;
        }
        ListNode pre = start.next;
        ListNode tmp = end.next;
        end.next = null;
        start.next = reverseList(pre);
        pre.next = tmp;

        return list.next;
    }

    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode tmp = null;
        ListNode cur = head;
        while (cur != null) {
            tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;
        }
        return pre;
    }
}
