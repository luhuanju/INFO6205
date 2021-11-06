package assignment6;

public class Problem4 {


    boolean isB=true;

    /**
     *
     * T : O (n)  : nodes numbers
     * S : O(log N)  : recursion of stack
     *
     * @param root
     * @return
     */
    public boolean isBalanced(TreeNode root) {
        dfsWithHeight(root);
        return isB;

    }


    //thi function : use each node left and right subtree max height for determin this solution.
    public int dfsWithHeight(TreeNode root){

        if(root==null) return 0;

        int l= dfsWithHeight(root.left);
        int r= dfsWithHeight(root.right);

        if(Math.abs(l-r)>1) isB=false;
        return Math.max(l,r)+1;

    }
}
