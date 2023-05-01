class Solution {
    public String reverseWords(String s) {
        String[] xx= s.split(" ");
        String ans="";
        for(int i=0; i< xx.length; i++){
            String c= xx[i];
            String an= doReverse(c);
            ans+= an;
        }
        return ans.substring(0, ans.length()-1);
    }
    String doReverse(String a){
        String ans="";
        for(int i= a.length()-1; i>=0; i--){
            ans= ans+ a.charAt(i);
        }
        
        return ans+" ";
    }
}