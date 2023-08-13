class Solution {
public:
    int numIslands(vector<vector<char>>& grid) {
     int m=grid.size();
     int n=grid[0].size();
     int count=0;
     for(int i=0;i<m;i++){
         for(int j=0;j<n;j++){
             if(grid[i][j]=='1'){
                 count++;
                 dfs(i,j,m,n,grid);
                
             }
         }
     }   
        return count;
    };
    void dfs(int x, int y, int m, int n,vector<vector<char>> & grid){
        grid[x][y]='*';
        int nx[]={1,0,-1,0};
        int ny[]={0,-1,0,1};
        
        for(int i=0;i<4;i++){
            int newX=x+nx[i];
            int newY=y+ny[i];
            if(newX>=0&&newX<m && newY>=0 && newY <n){
                if(grid[newX][newY]=='1'){
                    dfs(newX,newY,m ,n,grid);
                }
            }
            
        }
        
    }
};