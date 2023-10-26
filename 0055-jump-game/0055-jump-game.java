class Solution {
    public boolean canJump(int[] nums) {
        int n= nums.length;
        int dp[]= new int[n+1];
        Arrays.fill(dp, -1);
        return solve(nums, n, 0, dp);
    }
    boolean solve(int[] nums, int n, int id, int []dp){       
        if(id==n-1){
            return true;
        }
        // System.out.println("solving for index"+id+"  value"+ nums[id]);
        if(dp[id] != -1){
            return dp[id]==1? true: false;
        }
        int x= nums[id];
        boolean ans= false;
        for(int i=1; i<=x && id+i<=n; i++){
            ans= ans|| solve(nums, n, id+i, dp);
        }
        dp[id]= ((ans==true)?1: 0);
        return ans;
        
    }
}

// class Solution {
//     public boolean canJump(int[] nums) {
//         int n= nums.length;
//         boolean dp[][] = new boolean[n][n];
//         // show(dp);
        
        
        
//         for(int i=0; i<=nums[0] && i< n; i++){
//             dp[0][i]= true;
//         }
        
//         for(int i=1; i< n; i++){
//             for(int j=i; j<=i+nums[i] && j< n; j++){
//                 if(j==i){
//                     boolean x=false;
//                     for(int p=0; p< j; p++){
//                         x= dp[p][j];
//                         if(x== true){
//                             break;
//                         }
//                     }
//                     dp[i][j]= x;
//                      // dp[i][j]= dp[i-1][j];
//                 }
//                 else{
//                     dp[i][j]= dp[i][j-1];
//                 }
//             }
//         }
//         // show(dp);
//         return dp[n-1][n-1];
               
//     }
//     void show(boolean[][] dp){
//         for(int i=0; i< dp.length; i++){
//             for(int j=0; j< dp[0].length; j++){
//                 System.out.print(dp[i][j]+" ");
//             }
//             System.out.println();
//         }
//         return;
//     }
// }