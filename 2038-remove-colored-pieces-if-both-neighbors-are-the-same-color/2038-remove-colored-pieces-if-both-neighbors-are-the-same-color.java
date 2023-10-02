class Solution {
    public boolean winnerOfGame(String c) {
        int Alice=0;
        int Bob=0;
        for(int i=1;i<c.length()-1;i++){
            char current=c.charAt(i);
             char prev=c.charAt(i-1);
             char nextt=c.charAt(i+1);
            if(current=='A' && prev=='A' && nextt=='A'){
                Alice++;
            }else if(current=='B' && prev=='B' && nextt=='B'){
                Bob++;
            }
        }
        return Alice>Bob;
    }
}