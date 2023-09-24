class Solution {
    public double champagneTower(int poured, int query_row, int query_glass) {
        // int i=0;
        // int j=0;

        int n= query_row> query_glass? query_row: query_glass;
        double[][] dp = new double[n+1][n+1];
        dp[0][0]= poured;
        System.out.println(dp[0][0]+" ");

        for(int i=1; i<=query_row; i++){
            for(int j=0; j<=i; j++){
                if(j==0){
                    if(dp[i-1][j]>1)
                        dp[i][j]= (dp[i-1][j]-1)/2;
                    else
                        dp[i][j]=0;
                }
                else if(j==i){
                    if(dp[i-1][j-1]> 1)
                        dp[i][j]= (dp[i-1][j-1]-1)/2;
                    else
                        dp[i][j]=0;
                }
                else{
                    if(dp[i-1][j-1]>1 || dp[i-1][j]>1)
                        dp[i][j]= (dp[i-1][j-1]>1?(dp[i-1][j-1]-1)/2:0)+ (dp[i-1][j]>1? (dp[i-1][j]-1)/2: 0);
                    else
                        dp[i][j]=0;
                }

                System.out.print(dp[i][j]+" ");

                if(j==query_glass && i==query_row){
                    return dp[i][j]>1?1:dp[i][j];
                }   
            }
            System.out.println();
        }
        return dp[query_row][query_glass]>1?1:dp[query_row][query_glass];


    }
}