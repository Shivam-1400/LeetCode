class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int m= matrix.length;
        int n= matrix[0].length;
        
        int [][] dp = new int[m][n];
        for(int j=0; j<n; j++){
            dp[0][j]= matrix[0][j];        
        }
        for(int i=1; i< n; i++){
            for(int j=0; j<n; j++){
                if(j==0){
                    dp[i][j]= matrix[i][j]+ Math.min(dp[i-1][j], dp[i-1][j+1]);
                }
                else if(j == n-1){
                    dp[i][j]= matrix[i][j]+ Math.min(dp[i-1][j-1], dp[i-1][j]);
                }
                else{
                    dp[i][j]= matrix[i][j]+ Math.min(dp[i-1][j], Math.min(dp[i-1][j+1],  dp[i-1][j-1]));
                }
            }
        }
        int ans= dp[m-1][0];
        for(int j=1; j<n; j++){
            ans= Math.min(ans, dp[m-1][j]);        
        }
        
        return ans;
        
    }
}