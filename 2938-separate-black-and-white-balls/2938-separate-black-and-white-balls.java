class Solution {
    public long minimumSteps(String s) {
        int j = s.length()-1;
        long w = 0;
        long ans = 0;

        while(j >= 0){
            if(s.charAt(j)=='0') {
                w++;
            } 
            else {
                ans += w;
            }
            j--;
        }

        return ans;
    }
}