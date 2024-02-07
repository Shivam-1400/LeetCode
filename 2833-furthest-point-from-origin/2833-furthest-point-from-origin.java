class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        
        int lc=0;
        int rc=0;
        int uc= 0;
        for(char c: moves.toCharArray()){
            if(c=='L'){
                lc++;
            }
            else if(c=='R'){
                rc++;
            }
            else{
                uc++;
            }
        }
        return Math.max(Math.abs(lc-rc+uc), Math.abs(rc-lc+uc));
    }
}