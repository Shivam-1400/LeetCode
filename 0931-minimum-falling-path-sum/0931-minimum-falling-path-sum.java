class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n= matrix.length;
        int[][] dp= new int[n][n];
        
        for(int i=0; i<n;i++){
            dp[0][i]= matrix[0][i];
        }
        
        for(int i=1; i<n; i++){
            for(int j=0; j<n; j++){
                if(j==0){
                    dp[i][j]= matrix[i][j]+ Math.min(dp[i-1][j], dp[i-1][j+1]);
                }
                else if(j== n-1){
                    dp[i][j]= matrix[i][j]+ Math.min(dp[i-1][j], dp[i-1][j-1]);
                }
                else{
                    dp[i][j]= matrix[i][j]+ Math.min(dp[i-1][j], Math.min(dp[i-1][j+1], dp[i-1][j-1]));
                }
            }
        }
        int ans= Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            ans= Math.min(dp[n-1][i], ans);
        }
        return ans;
    }
    
//     public int minFallingPathSum(int[][] matrix) {
//         int n= matrix.length;
//         int ans= Integer.MAX_VALUE;
//         for(int i=0; i<n; i++){
//             int a= solve(matrix, n, 0, i, matrix[0][i]);
//             ans= Math.min(ans, a);
//         }
//         return ans;
//     }
//     int solve(int[][] mat, int n, int i, int j, int sum){
//         if(i+1==n){
//             return sum;
//         }
        
//         int s1= solve(mat, n, i+1, j, sum+mat[i+1][j]);
//         int s2= Integer.MAX_VALUE;
//         int s3= Integer.MAX_VALUE;
//         if(j-1>=0)
//              s2= solve(mat, n, i+1, j-1, sum+mat[i+1][j-1]);
//         if(j+1<n)
//              s3= solve(mat, n, i+1, j+1, sum+mat[i+1][j+1]);
        
//         return Math.min(s1, Math.min(s2, s3));
//     }
}