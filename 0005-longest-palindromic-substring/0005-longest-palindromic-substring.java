class Solution {
    int mxLen=0;
    int st=0;
    public String longestPalindrome(String s) {
        
        int n= s.length();
        
        if(n<=1){
            return s;
        }
        
        for(int i=0; i< n; i++){
            expandString(s, i, i+1);
            expandString(s, i, i);
        }
        return s.substring(st, st+mxLen);
        
    }
    void expandString(String s, int j, int k){
        int n= s.length();
        int len= k-j-1;
        while(j>=0 && k< n && s.charAt(j)== s.charAt(k)){
            k++;
            j--;
            len++; len++;
        }
        if(mxLen< len){
            mxLen= len;
            st= j+1;
        }
    }

    
    
//This will give longest palindromice subsequence not substring
//     public String longestPalindrome(String s) {
//         int n= s.length();
        
//         if(isPalindrome(s)){
//             return s;
//         }
        
//         return solve(s, n, 0, "");

//     }
//     String solve(String s, int n, int idx, String ax){
//         if(idx== n){
//             if(isPalindrome(ax)){
//                 return ax;
//             }
//             return "*";
//         }
        
//         String p= solve(s, n, idx+1, ax+s.charAt(idx));
//         String q= solve(s, n, idx+1, ax);
        
//         if(p=="*" && q=="*"){
//             return "";
//         }
//         else if(p=="*"){
//             return q;
//         }
//         else if(q=="*"){
//             return p;
//         }
//         else{
//             return p.length()> q.length()? p: q;
//         }
//     }
//     boolean isPalindrome(String ax){
//         String bx="";
//         for(int i=0; i< ax.length(); i++){
//             bx=  ax.charAt(i)+bx;
//         }
//         return ax.equals(bx);
//     }
}