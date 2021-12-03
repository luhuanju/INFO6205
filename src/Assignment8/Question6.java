package Assignment8;

import java.util.LinkedList;
import java.util.Queue;

public class Question6 {


    public int shortestPathBinaryMatrix(int[][] grid) {

        // this is pro for search the "shortest" path. so, we need to use the BFS.

        int n=grid.length;

        if(grid[0][0]==1||grid[n-1][n-1]==1) return -1;

        int [][] direc=new int[][]{{-1,0}, {-1,1}, {0,1},{1,1}, {1,0}, {1,-1}, {0,-1}, {-1,-1}};
        Queue<int[]> q=new LinkedList<>();
        q.offer(new int[]{0,0});
        grid[0][0]=1;

        int ans=0;

        while(!q.isEmpty()){

            ans+=1;
            int size = q.size();

            while(size-->0){
                int top[]=q.poll();
                if(top[0]==n-1&&top[1]==n-1) return ans;// here, wo go the  "end" point
                for(int i=0;i<8;++i){
                    int netx=top[0]+direc[i][0];
                    int nety=top[1]+direc[i][1];
                    if(netx<0||netx>n-1||nety<0||nety>n-1) continue;//  is this cell "out" matrix?
                    if(grid[netx][nety]==1) continue;
                    grid[netx][nety]=1; // update status.
                    q.add(new int[]{netx,nety}); // add cell to queue
                }
            }
        }
        return -1;


    }
}
