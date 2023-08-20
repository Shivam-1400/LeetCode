class Solution {
    public boolean canPartition(int[] nums) {
        int sm=0;
        int n= nums.length;
        for(int i=0; i< n; i++){
            sm+= nums[i];
        }
        if(sm %2 !=0){
            return false;
        }
        boolean ans= solve(sm/2, nums);
        return ans;
    }
    boolean solve(int sum, int[] nums){
        int n= nums.length;
        boolean[][] dp= new boolean[n][sum+1];
        
        
        for(int i=0; i< n; i++){
            dp[i][0]= true;
        }
        if(nums[0]<= sum)
            dp[0][nums[0]]= true;
        
        for(int i=1; i< n; i++){
            for(int j=0; j<= sum; j++){
                boolean a1= false, a2= false;
                
                if(nums[i]<= j){
                    a1= dp[i-1][j- nums[i]];
                }
                a2= dp[i-1][j];
                
                dp[i][j]= a1||a2;
            }
        }
        return dp[n-1][sum];
        
    }
}