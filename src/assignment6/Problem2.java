package assignment6;

import java.util.ArrayList;
import java.util.List;

public class Problem2 {


    /**
     *
     * T : O (N) : O (tree1 + tree2)
     * S : O( N)  O (list store tree for tree1 + tree2 )
     *
     * @param root1
     * @param root2
     * @return
     */
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        searchLeaf(root1,res1);
        searchLeaf(root2,res2);
        return res1.equals(res2);
    }

    List<Integer> res1=new ArrayList<>();
    List<Integer> res2=new ArrayList<>();
    public void searchLeaf(TreeNode node, List<Integer> res) {
        if(node==null)return;
        if(node.left==null && node.right==null){res.add(node.val);}
        searchLeaf(node.left,res);
        searchLeaf(node.right,res);
    }
}
