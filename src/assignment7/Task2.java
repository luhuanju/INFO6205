package assignment7;

public class Task2 {


    /**
     *
     *
     */
    public int countArrangement(int n) {
        return dfs(1,n,new boolean[n+1]);
    }


    public int dfs(int i,int n,boolean[]vis){
        if(i>n)return 1;
        int res=0;
        for(int j=1;j<=n;j++){
            if(!vis[j]&&(i%j==0||j%i==0)){
                vis[j]=true;
                res+=dfs(i+1,n,vis);
                vis[j]=false;
            }
        }
        return res;
    }
}
