package asgignment4;

public class Problem2 {

    class Node {
        public int val;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _next) {
            val = _val;
            next = _next;
        }
    };


    /**
     * Time Complexity : O(n)
     * Space Complexity : O(1)
     */

    public Node insert(Node head, int insertVal) {
        if (head == null) {
            Node node = new Node(insertVal, null);
            node.next = node;
            return node;
        }
        Node prev = head;
        Node node = head;
        Node max = head;

        while (node != null) {
            prev = node;
            node = node.next;

            if (node.val <= insertVal && node.next.val >= insertVal) {
                Node newNode = new Node(insertVal, node.next);
                node.next = newNode;
                return head;
            }

            max = max.val > node.val ? max : node;
            if (node == head) {
                Node newNode = new Node(insertVal, max.next);
                max.next = newNode;
                return head;
            }
        }
        return head;
    }

}
