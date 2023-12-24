class Solution {
    public void solve(char[][] board) {
        int m= board.length;
        int n= board[0].length;
        
        for(int i=0; i< m; i++){
            for(int j=0; j< n; j++){
                if((i==0 || j==0 || i== m-1 || j== n-1) && board[i][j]=='O'){
                    solve(board, i, j);
                }
            }
        }
        
        for(int i=0; i< m; i++){
            for(int j=0; j< n; j++){
                if(board[i][j]=='-'){
                    board[i][j]= 'O';
                }
                else{
                    board[i][j]= 'X';
                }
            }
        }
    }
    void solve(char[][] br, int x, int y){
        br[x][y]= '-';
        
        int m= br.length;
        int n= br[0].length;
        
        int[] nx= {1, 0, -1, 0};
        int ny[]= {0, 1, 0, -1};
        
        for(int i=0; i< 4; i++){
            int newX= x+ nx[i];
            int newY= y+ ny[i];
            
            if(newX>=0 && newX< m && newY>=0 && newY<n && br[newX][newY]== 'O'){
                solve(br, newX, newY);
            }
        }
    }
}