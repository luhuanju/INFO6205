package assignment3;

public class Problem2 {



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
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy=new ListNode(-1);
        dummy.next=head;

        ListNode temp=head;
        ListNode pre=dummy;

        while(temp!=null){
            if(temp.val==val){
                pre.next=temp.next;
            }else{
                pre=temp;
            }
            temp=temp.next;

        }
        return dummy.next;
    }





}
