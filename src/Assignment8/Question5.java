package Assignment8;

public class Question5 {
    public int countComponents(int n, int[][] edges) {

        int count=0;
        int[] nodes=new int[n];
        boolean[] mark=new boolean[n];


        // build  our graph using matrix.

        boolean[][] gra=new boolean[n][n];
        for(int[] i: edges){
            gra[i[0]][i[1]]=true;
            gra[i[1]][i[0]]=true;
        }
        for(int i=0;i<n;i++){
            if(!mark[i]){
                // how update our connection components
                //the answer is, after we finish search using dfs for one node, then all the mark node is in the same
                //component. BUt wo do not know how much, so we need to traverse all nodes, by plusing components number +1
                count++;
                dfs(gra,i,mark,count);
            }
        }
        return count;
    }

    public void dfs( boolean[][] gra, int node, boolean[] mark, int count){

        mark[node]=true;

        for(int i=0;i<gra.length;i++){
            if(!mark[i] && gra[node][i]){
                dfs(gra,i,mark,count);
            }
        }

    }
}
