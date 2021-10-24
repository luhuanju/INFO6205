package mid;

import java.util.LinkedList;
import java.util.Queue;

public class Problem4 {

    static class TreeNode{
        int val;
        TreeNode left,right;
        TreeNode(int val){
            this.val=val;
        }
    }


    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        TreeNode n2=new TreeNode(2);
        TreeNode n3=new TreeNode(3);
        TreeNode n4=new TreeNode(4);
        TreeNode n5=new TreeNode(5);
        TreeNode n6=new TreeNode(6);
        TreeNode n7=new TreeNode(7);
        TreeNode n8=new TreeNode(8);
        TreeNode n9=new TreeNode(9);
        TreeNode n10=new TreeNode(10);
        TreeNode n11=new TreeNode(11);
        TreeNode n12=new TreeNode(12);
        TreeNode n13=new TreeNode(13);
        TreeNode n14=new TreeNode(14);
        TreeNode n15=new TreeNode(15);
        root.left=n2;
        root.right=n3;

        n2.left=n4;
        n2.right=n5;

        n3.left=n6;
        n3.right=n7;

        n4.left=n8;
        n4.right=n9;

        n5.left=n10;
        n5.right=n11;

        n6.left=n12;
        n6.right=n13;

        n7.left=n14;
        n7.right=n15;

        printNodes(root);

    }

    /**
     * T: O (n)
     * S: O(n) : n is mean By level
     *
     */
    static void printNodes(TreeNode root){
        if(root==null) return;
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);

        int levelSize=1;
        while (!q.isEmpty()){
            int size= q.size();
            levelSize++;
            int curSize=0;
            System.out.println("------");
            while (size-->0){
                TreeNode cur=q.poll();

                System.out.println(cur.val);
                if (cur.left!=null && curSize++<levelSize ){
                    q.add(cur.left);
                }
                if (cur.right!=null&& curSize++<levelSize ){
                    q.add(cur.right);
                }
            }

        }
    }


}
