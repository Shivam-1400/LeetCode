class Solution {
    public int totalMoney(int n) {
        int ans= 0;
        int round =1;
        for(int i=0; i< n; ){
            int st= round;
            for(int k=0; k< 7 && i<n; k++, i++){
                ans+= st;
                st++;
            }
            round++;            
        }
        return ans;
    }
}