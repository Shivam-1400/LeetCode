// class Solution {
//     public int numSquares(int n) {
//         List<Integer> ls= new ArrayList<>();
//         for(int i=1; i*i<=n; i++){
//             ls.add(i*i);
//         }
//         Collections.sort(ls, (a, b)-> b-a);
//         System.out.println(ls);
        
//         int ans= solve(n, ls, 0);
//         return ans;
        
//     }
//     int solve(int n, List<Integer> ls, int count){
//         if(n==0){
//             return count;
//         }
//         if(n< 0){
//             return Integer.MAX_VALUE;
//         }
//         int ans= Integer.MAX_VALUE;
//         for(int i=0; i< ls.size();  i++){
//             int a= solve(n-ls.get(i), ls, count+1);
//             int b= solve(n, ls, count);
//             ans= Math.min(a, Math.min(ans,b));
//         }
        
//         return ans;
//     }
// }


class Solution {
    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        
        dp[0] = 0;
        dp[1]= 1;
        
        for (int i = 2; i <= n; i++) {
            for (int st = 1;Math.pow(st, 2) <= i; st++) {
                int prv = dp[i - (int) Math.pow(st, 2)];
                dp[i] = Math.min(dp[i], prv + 1);
            }
        }
        
        // for(int x: dp){
        //     System.out.println(x);
        // }
        return dp[n];
    }
}