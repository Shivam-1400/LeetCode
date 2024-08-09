class Solution {
    public int numMagicSquaresInside(int[][] grid) {    
        int n = grid.length; int m = grid[0].length; int ans = 0;
        for(int i = 0 ; i <= n - 3; i++){
            for(int j = 0 ; j <= m - 3; j++){
                if(solve(grid,i,j)){
                    ans += 1;
                }
            }
        }
        return ans;
    }
    public boolean solve(int grid[][],int r,int c){
        boolean vis[] = new boolean [11];
        vis[0] = true;

        for(int i = 0; i < 3; i++){
            for(int j = 0 ; j < 3; j++){
                int num = grid[r+i][c+j];
                if(num < 1 || num > 9 || vis[num]){//number duplicate or num < 1 ornum > 9
                    return false;
                }else{
                    vis[num] = true;
                }
            }
        }

        int sum = grid[r][c] + grid[r][c+1] + grid[r][c+2];
        for(int i = 0 ; i < 3; i++){
            int row_sum = grid[r + i][c] + grid[r + i][c + 1] + grid[r + i][c + 2];
            int col_sum = grid[r][c + i] + grid[r + 1][c + i] + grid[r + 2][c + i];

            if(row_sum != sum || col_sum != sum){
                return false;
            }
        }

        int digonal = grid[r][c] + grid[r+1][c+1] + grid[r+2][c+2];
        int anti_digonal = grid[r][c+2] + grid[r+1][c+1] + grid[r+2][c];

        return digonal == sum || anti_digonal == sum;
    }
}