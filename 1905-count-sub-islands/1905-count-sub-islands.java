class Solution {
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int m= grid1.length;
        int n= grid1[0].length;
        
        
        int count=0;
        for(int i=0; i< m; i++){
            for(int j=0; j< n; j++){
                int flag=1;
                if(grid2[i][j]==1){
                    flag= dfs(grid1, grid2, m, n, i, j, flag);
                    if(flag==1){
                        count++;
                    }
                }
                flag=1;
            }
        }
        return count;
    }
    int dfs(int[][] grid1, int[][] grid2, int m, int n, int x, int y, int flag){
        if(grid2[x][y]==1){
            if(grid1[x][y] ==0){
                flag=0;
                return 0;
            }
        }
        grid2[x][y]=0;
        int rx[]= {1, 0, -1, 0};
        int cy[]= {0, 1, 0, -1};
        
        for(int i=0; i< 4; i++){
            int nx= x+ rx[i];
            int ny= y+ cy[i];
            
            if(nx>=0 && ny>=0 && nx<m && ny< n && grid2[nx][ny]==1){
                flag= dfs(grid1, grid2, m, n, nx, ny, flag);
            }
        }
        return flag;
    }
}