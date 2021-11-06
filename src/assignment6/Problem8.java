package assignment6;

import java.util.*;

public class Problem8 {

    int min =0;int max=0;
    Map<Integer, PriorityQueue<int[]>> map=new HashMap<>();

    /**
     * Main function
     *
     *  T : O(n) : for nodes all N  +  O (m log m ) for PriorityQueue add (m is the PriorityQueue size )
     *  S : O(log N) for recursion +  O (N) list (PriorityQueue) for store all nodes (N is all nodes)
     *
     */
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        dfs(root,0,0);
        for(int i=min;i<=max;i++){
            List<Integer> l=new ArrayList<>();
            while(!map.get(i).isEmpty()){
                l.add(map.get(i).poll()[1] );
            }
            ans.add(l);
        }
        return ans;
    }
    /**
     *
     *     //there is 'muse be' min column + max column
     *     //we store each node's "column + its row"
     *
     *     //so we use a map.
     *
     *     //there is another thing we need to consider. if there are two or modes nodes with same column + same rows
     *     //then this question requires us to sort these nodes in increasing order by node's value
     *
     *     // think how we do this?
     *
     *     //so we use a PriorityQueue, and how we know the node's 'row'. we can just store nodes value + its row in an int[]
     *
     *     //so here we are
     *     //plus, this question has only one difficult or/ easily confusion thing, that is how customizing the PriorityQueue
     */

    public void dfs(TreeNode root, int row , int volumn){

        if(root==null)return;
        min=Math.min(min,volumn);
        max=Math.max(max,volumn);
        if(map.get(volumn)==null){

            map.put(volumn, new PriorityQueue<>((x, y) -> {
                if(x[0]==y[0]) return (x[1]-y[1]) ;
                else return x[0]-y[0];
            }
            ));
        }

        map.get(volumn).add(new int[]{row,root.val});

        dfs(root.left,row+1, volumn-1);
        dfs(root.right,row+1, volumn+1);



    }


}
