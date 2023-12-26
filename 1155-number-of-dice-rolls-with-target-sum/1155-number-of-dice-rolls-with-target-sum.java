class Solution {
    int [][]dp;
    int md= 1000000007;
    public int numRollsToTarget(int n, int k, int target) {
        dp= new int[31][1001];
        for(int i=0; i< n; i++){
            Arrays.fill(dp[i], -1);
        }
        int ans= solve(n, k, target, 0, 0);
        return ans;
    }
    int solve(int n, int k, int target, int sum, int tkn){
        if(sum> target){
            return 0;
        }
        if(n==tkn){
            if(sum== target){
                return 1;
            }  
            else{
                return 0;
            }
        }
        if(dp[tkn][sum] != -1){ 
            return dp[tkn][sum];
        }
        int ans= 0;
        for(int i=1; i<=k; i++){
             ans= (ans+ solve(n, k, target, sum+i, tkn+1))% md;
        }
        dp[tkn][sum]= ans%md;
        return ans%md;
    }
}
//for loop
//for each
//while
//do while