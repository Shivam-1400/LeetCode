class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n= cost.length;
        int price[]= new int[n+1];
        int ans=0;
        price[1]= cost[1];
        price[0]= cost[0];
        for(int i=2; i< n; i++){
            price[i]= cost[i]+ Math.min(price[i-1], price[i-2]);
            // ans= ans+ Math.min(cost[i-1], cost[i-1]);
        }
        return Math.min(price[n-1], price[n-2]);
    }
}