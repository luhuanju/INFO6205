package finalAssignments;

public class Node {
    public Node left,right;
    public int val;

    public Node(Node left, Node right, int val) {
        this.left = left;
        this.right = right;
        this.val = val;
    }

    public Node(int val) {
        this.val = val;
    }
}
