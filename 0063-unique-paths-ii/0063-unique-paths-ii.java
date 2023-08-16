class Solution {
    public int uniquePathsWithObstacles(int[][] og){
        if(og== null || og[0][0]==1)
            return 0;
        int m= og.length;
        int n= og[0].length;
        int dp[]= new int[n];
        dp[0]=1;
        for(int i=0; i< n; i++){
            if(og[0][i]== 1){
                dp[i]=0;
            }
            else{
                if(i> 0){
                    dp[i]+= dp[i-1];
                }
                
            }
        }
        show(dp);
        for(int i=1; i< m; i++){
            for(int j=0; j< n; j++){
                if(og[i][j]==1){
                    dp[j]=0;
                    continue;
                }
                else{
                    if(j>0){
                        dp[j] += dp[j - 1];
                    }
                }                
            }
            show(dp);
        }
        return dp[n-1];
    }
    void show(int[] ax){
        for(int i=0; i<ax.length; i++){
            System.out.print(ax[i]+" ");
        }
        System.out.println();
    }
    
//     public int uniquePathsWithObstacles(int[][] obstacleGrid) {
//         if (obstacleGrid == null || obstacleGrid[0][0] == 1) {
//             return 0;
//         }

//         int rows = obstacleGrid.length;
//         int cols = obstacleGrid[0].length;
//         int[] dp = new int[cols];
//         dp[0] = 1;
        
//         for (int r = 0; r < rows; r++) {
//             for (int c = 0; c < cols; c++) {
//                 if (obstacleGrid[r][c] == 1) {
//                     dp[c] = 0;
//                 } else {
//                     if (c > 0) {
//                         dp[c] += dp[c - 1];
//                     }
//                 }
                
//             }
//             show(dp);
//         }

//         return dp[cols - 1];        
//     }
}