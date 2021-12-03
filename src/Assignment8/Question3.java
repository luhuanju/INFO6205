package Assignment8;

public class Question3 {



    // classical DFS question
    public int numIslands(char[][] grid) {

        int m=grid.length,n=grid[0].length;

        boolean[][] visited =new boolean[m][n];
        int number=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(!visited[i][j] &&grid[i][j]=='1' ){
                    dfs(grid,visited,i,j);
                    number++;
                }
            }
        }
        return number;
    }

    public void dfs(char[][] grid, boolean[][] visited, int i, int j){

        if(i<0||i>=grid.length || j<0 || j>=grid[0].length) return;

        if(grid[i][j]!='1'|| visited[i][j]) return;


        visited[i][j]=true;

        dfs(grid,visited,i+1,j );
        dfs(grid,visited,i-1,j );
        dfs(grid,visited,i,j+1 );
        dfs(grid,visited,i,j-1 );

    }
}
