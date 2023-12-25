class Solution {
     int[] dp;
    public int numDecodings(String s) {
        dp= new int[s.length()+1];
        Arrays.fill(dp, -1);
        int ans= solve(s, 0, 0);
       
        return ans;
    }
    int solve(String s, int idx, int count){
        if(idx== s.length()){
            count++;
            dp[idx]= count;
            return count;
        }
        if(dp[idx]!= -1){
            return dp[idx];
        }
        int n1=0;
        int n2=0;
        if(idx+1<= s.length()){
            String s1= s.substring(idx, idx+1);
            n1= Integer.valueOf(s1);
        }
        if(idx+2<= s.length()){
            String s2= s.substring(idx, idx+2);
            n2= Integer.valueOf(s2);
        }
        int c1=0, c2=0;
        if(n1>0 && n1<=9){
            c1= solve(s, idx+1, count);
        }
        if(n2>9 && n2<=26){
            c2= solve(s, idx+2, count);
        }
        dp[idx]= c1+c2;
        return c1+c2;
        
    }
}