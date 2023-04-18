class Solution {
    public String mergeAlternately(String w1, String w2) {
        String ans="";
        int i=0;
        int j=0;
        int flag=0;
        while(i< w1.length() && j< w2.length()){
            ans= ans+ w1.charAt(i)+ w2.charAt(j);
            i++;j++;
        }
        if(i== w1.length()){
            ans= ans+ w2.substring(j);
        }else if(j== w2.length()){
            ans= ans+ w1.substring(i);
        }
        return ans;
    }
}