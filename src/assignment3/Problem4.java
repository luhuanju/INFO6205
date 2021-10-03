package assignment3;

public class Problem4 {

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
    public ListNode oddEvenList(ListNode head) {
        ListNode temp = head;
        ListNode ans = new ListNode();
        ListNode mid = new ListNode();
        ListNode[] arr = new ListNode[2];
        arr[0] = ans;
        arr[1] = mid;
        for(int i=1;temp!=null;i++)
        {
            if(i%2==1)
            {
                ans.next = temp;
                ans = ans.next;
            }else
            {
                mid.next = temp;
                mid = mid.next;
            }
            temp = temp.next;
        }
        mid.next=null;
        ans.next = arr[1].next;
        return arr[0].next;
    }

}
