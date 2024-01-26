class Solution {
//     public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
//         Queue<int[]> qe= new LinkedList<>();
//         int[][][] dp= new int[m+1][n+1][maxMove+1];
//         for(int i=0; i<m; i++){
//             for(int j=0; j<n; j++){
//                 for(int k=0; k< maxMove; k++){
//                     dp[i][j][k]= -1;
//                 }
//             }
//         }
        
//         for(int i=0; i<maxMove; i++){
//             for(int j=0; j<n; j++){
//                 dp[0][j][i]= 1;
//                 dp[m-1][j][i]= 1;
//             }
//         }
//         for(int i=0; i<maxMove; i++){
//             for(int j=0; j<m; j++){
//                 dp[j][0][i]= 1;
//                 dp[j][n-1][i]= 1;
//             }
//         }
//         qe.add(new int[]{startRow, startColumn});
//         // System.out.println(qe);
//         int ans=0;
//         int[] newX= {1, 0, -1, 0};
//         int[] newY= {0, 1, 0, -1};
        
//         for(int i=1; i<m; i++){
//             for(int j=1; j<n; j++){
                
//             }
//         }
        
//         System.out.println("-------");
//         return dp[startRow][startColumn][maxMove];
//     }
    
    //-----------------
//     public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
//         int mod= 1e9+7;
//         int[][][] dp= new int[m][n][maxMove+1];
//         for(int i=0; i<m; i++){
//             for(int j=0; j<n; j++){
//                 for(int k=0; k< maxMove; k++){
//                     dp[i][j][k]= -1;
//                 }
//             }
//         }
//         for(int i=1; i<=maxMove; i++){
//             for(int j=0; j<n; j++){
//                 dp[0][j][i]= 1;
//                 dp[m-1][j][i]= 1;
//             }
//         }
//         for(int i=1; i<=maxMove; i++){
//             for(int j=0; j<m; j++){
//                 dp[j][0][i]= 1;
//                 dp[j][n-1][i]= 1;
//             }
//         }
        
//         Queue<int[]> qe= new LinkedList<>();
//         qe.add(new int[]{startRow, startColumn});
//         int ans=0;
//         int[] newX= {1, 0, -1, 0};
//         int[] newY= {0, 1, 0, -1};
        
//             // System.out.println(qe);
//         while(qe.size()> 0){
//             int sz= qe.size();
//             System.out.println(sz);
//             for(int i=0; i< sz; i++){
//                 int[] pos= qe.remove();
//                 for(int k=0; k<4; k++){
//                     int nx= pos[0]+ newX[k];
//                     int ny= pos[1]+ newY[k];
//                     if(maxMove>0 && nx>=0 && nx<m && ny>=0 && ny<n ){
//                         qe.add(new int[]{nx, ny});
//                     }
//                     else if(maxMove!=0 && (nx==-1 || ny==-1 || nx==m || ny==n)){
//                         ans = (ans+1)%mod;
//                     }
//                 }              
//             }
//             maxMove--; 
//         }        
//         System.out.println("-------");
//         return ans;
//     }
    
    public int findPaths(int m, int n, int N, int x, int y) {
        final int M = 1000000000 + 7;
        int[][] dp = new int[m][n];
        dp[x][y] = 1;
        int count = 0;

        for (int moves = 1; moves <= N; moves++) {
            int[][] temp = new int[m][n];

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == m - 1) count = (count + dp[i][j]) % M;
                    if (j == n - 1) count = (count + dp[i][j]) % M;
                    if (i == 0) count = (count + dp[i][j]) % M;
                    if (j == 0) count = (count + dp[i][j]) % M;
                    temp[i][j] = (
                            ((i > 0 ? dp[i - 1][j] : 0) + (i < m - 1 ? dp[i + 1][j] : 0)) % M +
                            ((j > 0 ? dp[i][j - 1] : 0) + (j < n - 1 ? dp[i][j + 1] : 0)) % M
                    ) % M;
                }
            }
            dp = temp;
        }

        return count;
    }

}