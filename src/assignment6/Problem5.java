package assignment6;

public class Problem5 {


    /**
     *
     * T : O (m * n)  Let say the bigger tree has M nodes. smaller tree N node.
     * S : 0 (log M)  the bigger tree recursion stack
     *
     */

    // first thinking, if we have just same tree. what happend?
    // we can compare each node for those two 'same tre'
    // but, if we have a 'bigger' tree, what we can do ?
    // we can interate 'each node' and compare it with another tree's root
    // som here we are.

    public boolean isSubtree(TreeNode root, TreeNode subRoot ) {
        if(root==null) return false;

        if(isSame(root, subRoot)) return true;

        return isSubtree(root.left,subRoot)||
                isSubtree(root.right,subRoot);
    }


    public boolean isSame(TreeNode root, TreeNode subRoot){
        if(root==null && null==subRoot) return true;
        else if(root==null || null==subRoot) return false;
        else if(root.val!=subRoot.val) return false;
        boolean isL= isSame(root.left, subRoot.left);
        boolean isR= isSame(root.right, subRoot.right);

        return isL && isR;
    };

}
