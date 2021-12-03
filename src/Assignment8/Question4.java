package Assignment8;

public class Question4 {



    public int findCircleNum(int[][] isConnected) {
        int n= isConnected.length;
        int numberOfPro=0; // number of province plus, the connect component tag;


        int[] component=new int[n];
        boolean[] mark=new boolean[n];

        for(int i=0;i<n;i++){
            if(!mark[i]){
                numberOfPro++;
                dfs(isConnected,component,mark,i,numberOfPro);
            }
        }
        return numberOfPro;

    }

    public void dfs(int[][] isConnected, int[] component, boolean[] mark, int curNode, int componentTag ){

        mark[curNode]=true;
        component[curNode]=componentTag;

        for(int i=0;i<isConnected[0].length;i++){
            if(!mark[i]&& isConnected[curNode][i]==1){
                dfs(isConnected,component,mark,i,componentTag);
            }
        }
    }
}
