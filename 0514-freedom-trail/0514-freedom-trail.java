class Solution {
    int n; int dp[][];
    public int findRotateSteps(String ring, String key) {      
        n = ring.length();int m = key.length();
        dp = new int [n][m];
        for(int i = 0; i< dp.length; i++){
            Arrays.fill(dp[i],-1);
        }
        return helper(0,0,ring,key);
    }
    public int dir(int i,int idx1,int len){
        int anti = Math.abs(i - idx1);
        int clock = len - anti;
        return Math.min(anti,clock);
    }
    public int helper(int idx1,int indx2,String ring,String key){
        if(indx2 == key.length()) return 0;
        if(dp[idx1][indx2] != -1) return dp[idx1][indx2];
        int ans = Integer.MAX_VALUE;
        for(int i = 0 ; i < ring.length(); i++){
            if(ring.charAt(i) == key.charAt(indx2)){
                int step = dir(i,idx1,n) + 1;
                int totalstep = step + helper(i,indx2+1,ring,key);
                ans = Math.min(totalstep,ans);
            }
        }
        return dp[idx1][indx2] = ans;
    }
}