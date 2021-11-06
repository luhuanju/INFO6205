package assignment6;

public class Problem7 {


    /**
     * T :O(N)
     * O (log N)
     * @param root
     */


    public void flatten(TreeNode root) {
        helper(root);
    }

    TreeNode pre=null;
    public void helper(TreeNode node){

        // 1，5   pre = null
        // 2，2   pre=5  2.right=5
        // 3，1   pre=2, 1.right=2

        if(node==null)
            return ;

        helper(node.right);
        helper(node.left);


        node.right=pre;
        node.left=null;

        pre=node;
    }


}
