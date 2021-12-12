package finalAssignments;

public class CheckTreeFoldable {


    public static void main(String[] args) {
        Node n = new Node(10);
        n.left = new Node(7);
        n.right = new Node(15);
        n.left.right = new Node(9);
        n.right.left = new Node(11);
        boolean testcase1 = IsFoldable(n);
        System.out.println(testcase1);


        Node n1 = new Node(10);
        n1.left = new Node(7);
        n1.right = new Node(15);
        n1.left.left = new Node(9);
        n1.right.right = new Node(11);
        boolean testcase2 = IsFoldable(n1);
        System.out.println(testcase2);


        Node n2 = new Node(10);
        n2.left = new Node(7);
        n2.right = new Node(15);
        n2.left.left = new Node(5);
        n2.right.left = new Node(11);
        boolean testcase3 = IsFoldable(n2);
        System.out.println(testcase3);


        Node n3 = new Node(10);
        n3.left = new Node(7);
        n3.right = new Node(15);
        n3.left.left = new Node(9);
        n3.left.right = new Node(10);
        n3.right.left = new Node(12);
        boolean testcase4 = IsFoldable(n3);
        System.out.println(testcase4);

    }
    static boolean IsFoldable(Node root) {
        if (root == null)
            return true;

        return isfold(root.left, root.right);

    }
    static boolean isfold(Node temp, Node temp1) {
        if (temp == null && temp1 == null)
            return true;
        return (temp != null && temp1 != null) && isfold(temp.left, temp1.right) && isfold(temp.right, temp1.left);

    }
}
