class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int m= triangle.size();
        int [][] dp= new int[m][];
        for(int i=0; i< m; i++){
            int n= triangle.get(i).size();
            dp[i]= new int[n];
        }
        
        
        dp[0][0]= triangle.get(0).get(0);
        
        for(int i=1; i< m; i++){
            int n= triangle.get(i).size();
            for(int j=0; j< n; j++){
                if(j==0){
                    dp[i][j]= dp[i-1][j]+ triangle.get(i).get(j);
                }
                else if(j==n-1){
                    dp[i][j]= triangle.get(i).get(j)+ dp[i-1][j-1];
                }
                else{
                    dp[i][j]= triangle.get(i).get(j)+ Math.min(dp[i-1][j], dp[i-1][j-1]);
                }
                
            }
        }
        showJagged(dp);
        int ans= dp[m-1][0];
        for(int i=0; i< dp[m-1].length; i++){
            ans= Math.min(ans, dp[m-1][i]);
        }
        return ans;
    }
    void showJagged(int[][] ax){
        for(int i=0; i< ax.length; i++){
            for(int j=0; j< ax[i].length; j++){
                System.out.print(ax[i][j]+"  ");
            }
            System.out.println();
        }
    }
}