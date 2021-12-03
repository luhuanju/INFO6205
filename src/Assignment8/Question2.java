package Assignment8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question2 {


    public boolean validPath(int n, int[][] edges, int start, int end) {

        /**
         * Note : if you are using the Matrix here, it will waste a lot of memory and will result in OOM error
         * So wo use the Map to build our graph
         */
        Map<Integer, List<Integer>> graph=new HashMap<>();
        for(int[]e : edges){
            // since it is a di-direactional graph. so we add "both" relationship edge.
            graph.putIfAbsent(e[0],new ArrayList<>());
            graph.putIfAbsent(e[1],new ArrayList<>());
            graph.get(e[0]).add(e[1]);
            graph.get(e[1]).add(e[0]);
        }
        //
        return dfs(graph, start, end, new boolean[n]);
    }
    public boolean dfs(Map<Integer,List<Integer>> graph, int curNode, int end, boolean[] mark){

        mark[curNode]=true;
        if(curNode==end) return true;
        for(int next:graph.get(curNode)){
            if(!mark[next]){
                if(dfs(graph, next, end,mark )) return true;
            }
        }
        return false;
    }
}
