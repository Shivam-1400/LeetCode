// class Solution {
//     public int getLengthOfOptimalCompression(String s, int k) {
//         if(str.length()==0 || str.length()== k){
//             return 0;
//         }
//         int cnt=1;
//         String ans="";
//         int i=0;
//         for(i=0; i< s.length()-1; i++){
//             if(s.charAt(i) == s.charAt(i+1)){
//                 cnt++;
//             }
//             else{
//                 ans+= s.charAt(i);
//                 if(cnt>1){
//                     ans+= cnt;
//                 }
//                 cnt= 1;
//             }
//         }
//         ans+= s.charAt(i);
//         if(cnt>1){
//             ans+= cnt;
//         }
//         System.out.println(ans);
//         int ax= solve(ans, k, 0, "", 0);
        
//         return ax;
//     }
//     int solve(String str, int k, int idx, String ans,  int ntk){
//         if(idx== str.length()){
//             if(ntk== k){
//                 System.out.println(ans);
//                 return ans.length();
//             }
//             else{
//                 return Integer.MAX_VALUE;
//             }
//         }
        
//         char ch= str.charAt(idx);
//         int cnt= 1;
//         String count= "";
//         int i=idx+1;
//         while(i< str.length()){
//             if(!(str.charAt(i)<='z' && str.charAt(i)>=a)){
//                 count+= str.charAt(idx+i); 
//             }
//             i++;
//         }
//         if(Integer.parseInt(count)> 1){
//             cnt= Integer.parseInt(count);
//         }
        
//         int n1= Integer.MAX_VALUE;
//         int n2= Integer.MAX_VALUE;
        
        
        
        
//         // if(idx+1< str.length())
//         //     n1= solve(str, k, idx+1, ans+str.charAt(idx+1), ntk+1);
//         // int n2= solve(str, k, idx+1, ans+ str.charAt(idx), ntk+0);
        
//         return Math.min(n1, n2);
        
        
        
        
//     }
// }

class Solution {
    // Function to find the length of the optimal compression of a string with at most k deletions
    public int getLengthOfOptimalCompression(String s, int k) {
        int n = s.length(); // Length of the input string
        int[][] dp = new int[101][101]; // Dynamic programming array for memoization

        // Initializing the dp array with a large value (9999) to represent infinity
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                dp[i][j] = 999;
            }
        }

        dp[0][0] = 0; // Base case: 0 deletions for an empty string results in 0 compression length

        // Loop through each character of the string
        for (int i = 1; i <= n; i++) {
            // Loop through possible deletion counts (0 to k)
            for (int j = 0; j <= k; j++) {
                int count = 0, del = 0; // Variables to store the count of consecutive characters and deletions

                // Loop backward from the current character to the beginning of the string
                for (int t = i; t >= 1; t--) {
                    if (s.charAt(t - 1) == s.charAt(i - 1))
                        count++; // Increment count if the characters are the same
                    else
                        del++; // Increment deletion count if the characters are different

                    // Check if the remaining deletions are sufficient for the current substring
                    if (j - del >= 0) {
                        int temp = 0;
                        
                        // Determine the compression factor based on the count of consecutive characters
                        if (count >= 100)
                            temp = 3;
                        else if (count >= 10) 
                            temp = 2;
                        else if (count >= 2) 
                            temp = 1;
    
                        // Update the dp array with the minimum compression length
                        dp[i][j] = Math.min(dp[i][j], dp[t - 1][j - del] + 1 + temp);
                    }
                }

                // Consider the case where a deletion is made at the current position
                if (j > 0) {
                    dp[i][j] = Math.min(dp[i][j], dp[i - 1][j - 1]);
                }
            }
        }

        // Return the minimum compression length for the entire string with at most k deletions
        return dp[n][k];
    }
}