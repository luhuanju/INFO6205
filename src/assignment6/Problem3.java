package assignment6;

public class Problem3 {


    /**
     *      T : O (N) :
     *      S : O(log N)   recursion stack space
     *
     * @param root
     * @param targetSum
     * @return
     */
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null)
            return false;
        if(root.left==root.right && targetSum==root.val)return true;

        return hasPathSum(root.left,targetSum-root.val)||
                hasPathSum(root.right,targetSum-root.val) ;

    }
}
