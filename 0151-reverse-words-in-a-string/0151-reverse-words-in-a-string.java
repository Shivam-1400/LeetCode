class Solution {
    public String reverseWords(String s) {
        String [] ax= s.split(" ");
        String ans="";
        for(String x: ax){
            if(x=="") continue;
            ans= x+" "+ ans;
        }
        
        return ans.trim();
    }
}