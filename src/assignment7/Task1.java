package assignment7;

public class Task1 {

    int m=0,n=0;


    /**
     *
     * T : in the worst case is : t (M^2 * N^2)
     * O :
     */
    public boolean exist(char[][] board, String word) {

        m=board.length;
        n=board[0].length;

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(dfs(i,j,board,word,0)){
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * dfs ; thinking
     * Just think the dfs in 2D matrix like in a binary tree
     *
     */
    public boolean dfs(int x, int y, char[][] board,String word,int idx){

        if(idx==word.length()){
            return true;
        }
        if(x > board.length-1 || x <0 || y<0 || y>board[0].length-1 )
            return false;
        // if(idx==word.length())
        // return true;

        // if(board[x][y]=='1')
        //     return true;

        if(board[x][y]!=word.charAt(idx)){
            return false;
        }
        char temp=board[x][y];
        board[x][y]='1';

        boolean exist=
                dfs(x+1,y,board,word,idx+1)||
                        dfs(x-1,y,board,word,idx+1)||
                        dfs(x,y+1,board,word,idx+1)||
                        dfs(x,y-1,board,word,idx+1);

        board[x][y]=temp;
        return exist;
    }

}
