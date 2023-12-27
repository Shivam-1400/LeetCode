class Solution {
    public int minCost(String colors, int[] nt) {
        int ans=0;
        int n= colors.length();
        char pr= colors.charAt(0);
        int pri=0;
        for(int i=1; i< n; i++){
            if(colors.charAt(i)== pr){
                int min= Math.min(nt[i], nt[pri]);
                if(min== nt[pri]){
                    pri= i;
                }
                ans+= min;
            }
            else{
                pr= colors.charAt(i);
                pri= i;
            }
        }
        return ans;
    }
}