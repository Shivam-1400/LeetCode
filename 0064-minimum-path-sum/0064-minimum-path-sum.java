class Solution {
    public int minPathSum(int[][] grid) {
        int m= grid.length;
        int n= grid[0].length;
        int ax[]= new int[n];
        ax[0]= grid[0][0];
         for(int i=1; i< n; i++){
             ax[i]= grid[0][i]+ ax[i-1];
         }
        
        for(int i=1; i<m; i++){
            for(int j=0; j< n; j++){
                if(j==0){
                    ax[j]= grid[i][j]+ ax[j];
                }
                else{
                    ax[j]=  grid[i][j]+ Math.min(ax[j], ax[j-1]);   
                }
            }
        }
        return ax[n-1];
    }
    
//     public int minPathSum(int[][] grid) {
//         int m= grid.length;
//         int n= grid[0].length;
//         int dp[][]= new int[m][n];
//         dp[0][0]= grid[0][0];
//         for(int i=1; i< n; i++){
//             dp[0][i]= grid[0][i]+ dp[0][i-1];
//         }
        
//         for(int i=1; i< m; i++){
//             for(int j=0; j< n; j++){
//                 if(j==0){
//                     dp[i][j]= grid[i][j]+ dp[i-1][j];
//                 }
//                 else{
//                     dp[i][j]= grid[i][j]+ Math.min(dp[i-1][j], dp[i][j-1]);
//                 }
                
//                 // int p1= Integer.MAX_VALUE;
//                 // int p2= Integer.MAX_VALUE;
//                 // // if(i>0){
//                 //     p1= dp[i-1][j];                    
//                 // // }
//                 // if(j>0){
//                 //     p2= dp[i][j-1];
//                 // }
//                 // dp[i][j]= grid[i][j] + Math.min(p1, p2);
//             }
//         }
//         return dp[m-1][n-1];
//     }
}