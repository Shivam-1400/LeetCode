class Solution {
    public int closedIsland(int[][] grid) {
        int m= grid.length;
        int n= grid[0].length;
        
        for(int i=0; i< m; i++){
            for(int j=0; j< n; j++){
                if((i==0 || i== m-1 || j==0 || j== n-1) && grid[i][j]== 0){
                    dfs(grid, i, j);
                }
            }
        }
        int c= 0;
        for(int i=0; i< m; i++){
            for(int j=0; j< n; j++){
                if(grid[i][j]== 0){
                    c++;
                    dfs2(grid, i, j);
                }
            }
        }
        return c;
    }
    void dfs(int[][] gr, int x, int y){
        gr[x][y]= 1;
        
        int m= gr.length;
        int n= gr[0].length;
        int newX[]= {1, 0, -1, 0};
        int newY[]= {0, 1, 0, -1};
        
        for(int i=0; i< 4; i++){
            int nx= x+ newX[i];
            int ny= y+ newY[i];
            
            if(nx>=0 && nx< m && ny>=0 && ny<n && gr[nx][ny]== 0){
                dfs(gr, nx, ny);
            }
        }
    }
    void dfs2(int[][] gr, int x, int y){
        gr[x][y]= 5;
        
        int m= gr.length;
        int n= gr[0].length;
        int newX[]= {1, 0, -1, 0};
        int newY[]= {0, 1, 0, -1};
        
        for(int i=0; i< 4; i++){
            int nx= x+ newX[i];
            int ny= y+ newY[i];
            
            if(nx>=0 && nx< m && ny>=0 && ny<n && gr[nx][ny]== 0){
                dfs(gr, nx, ny);
            }
        }
    }
}