package assignment6;

public class Problem1 {



    /**
     *
     * T : O (N)  : tree nodes
     * S : O( log N)   : recursion space
     *
     */

    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1==null) return root2;
        if(root2==null) return root1;
        if(root1==root2) return null;

        TreeNode n=new TreeNode(root1.val+root2.val);
        n.left=mergeTrees(root1.left, root2.left);
        n.right=mergeTrees(root1.right, root2.right);
        return n;
    }

}
