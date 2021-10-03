package assignment3;

public class Problem3 {





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

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummpy=new ListNode();
        ListNode temp=dummpy;
        int carry=0;

        ListNode cur=null;

        while(l1!=null||l2!=null||carry!=0){
            int sum=(l1==null? 0: l1.val) + (l2==null? 0: l2.val)+ carry;
            carry=sum/10;

            cur=new ListNode(sum%10);
            temp.next=cur;
            temp=cur;

            l1=l1==null? null: l1.next;
            l2=(l2==null? null: l2.next);
        }

        return dummpy.next;

    }
}
