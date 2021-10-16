package assignment5;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Problem7 {


    /**
     * Time Complexity : O(n)+ O(5* log (n))
     * Space Complexity : O(n)
     */

    public int[][] highFive(int[][] items) {
        Map<Integer, PriorityQueue<Integer>> hash=new HashMap<>();
        for(int i[]:items){
            int id=i[0];
            hash.put(id,new PriorityQueue<Integer>((a,b)->b-a));
        }

        for(int i[]:items){
            int id=i[0];
            int score=i[1];
            hash.get(id).add(score);
        }

        int ans[][]=new int[hash.size()][2];
        int idx=0;

        for(int id: hash.keySet()){
            int sum=0;
            int times=5;
            while(times-->0){
                sum+=hash.get(id).poll();
            }
            int each[]=new int[]{id,sum/5};
            ans[idx++]=each;
        }
        return ans;
    }
}
