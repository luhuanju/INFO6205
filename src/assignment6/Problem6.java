package assignment6;

public class Problem6 {


    /**
     *
     * T ： : O(n)
     * S ： O（log N）
     */
    public boolean isSymmetric(TreeNode root) {
        return helper(root.left,root.right );
    }

    public boolean helper(TreeNode node1,TreeNode node2){
        if(node1==null || node2==null) return node1==node2;
        if(node2.val!=node1.val) return false;
        if(node1==node2) return true;

        boolean l=helper(node1.left, node2.right);
        boolean r=helper(node1.right, node2.left);
        return l&&r;
    }

}
