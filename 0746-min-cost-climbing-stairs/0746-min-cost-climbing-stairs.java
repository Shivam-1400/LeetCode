class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n= cost.length;
        // int price[]= new int[n+1];
        // int ans=0;
        // price[1]= cost[1];
        // price[0]= cost[0];
        for(int i=2; i< n; i++){
            cost[i]= cost[i]+ Math.min(cost[i-1], cost[i-2]);
            // ans= ans+ Math.min(cost[i-1], cost[i-1]);
        }
        return Math.min(cost[n-1], cost[n-2]);
    }
}