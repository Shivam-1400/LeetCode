class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n= isConnected.length;
        int count=0;
        for(int i=0; i< n; i++){
            for(int j=0; j< n; j++){
                if(isConnected[i][j]==1){
                    count++;
                    dfs(isConnected, n, i, j);
                }
            }
        }
        return count;
    }
    void dfs(int[][] isConnected, int n, int rooti, int rootj){
        isConnected[rooti][rootj]=0;
        
        for(int i=0; i<n;i++){
            if(isConnected[rooti][i]==1){
                dfs(isConnected, n, rooti, i);
            }
            if(isConnected[i][rootj]==1){
                dfs(isConnected, n, i, rootj);
            }
        }
        
    }
}