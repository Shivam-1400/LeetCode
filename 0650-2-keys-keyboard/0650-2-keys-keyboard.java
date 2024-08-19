class Solution {

    public static int getLargestDivisor(int number){
        int i;
        for (i = 2; i <=Math.sqrt(number); i++)
        {
            if (number % i == 0)
            {
                return number/i;
            }
        }
        return 1;
    }
    public static int numSteps(int n, int[] dp){
           if(n ==1 || n==2 || n==3 || n ==4){
            if(n == 1) dp[1] = 0;
            if(n == 2) dp[2] = 2;
            if(n == 3) dp[3] = 3;
            if(n == 4) dp[4] = 4;
            return dp[n];
        }

        int gd = getLargestDivisor(n);
        int times = n/gd;
        dp[n] = dp[gd] + (times-1)+1;

        return dp[n];
    }
    public int minSteps(int n) {
       int[] dp = new int[n+1];
    
        for(int i = 1;i<=n ;i++){
            numSteps(i, dp);
        }

        return dp[n];
    }
}