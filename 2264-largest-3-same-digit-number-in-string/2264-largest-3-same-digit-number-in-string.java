class Solution {
    public String largestGoodInteger(String num) {
        char[] ch= num.toCharArray();
        int n= ch.length;
        int result= -1;
        for(int i=0; i< n-2; i++){
            if(ch[i]== ch[i+1] && ch[i]== ch[i+2]){
                result= Math.max(result, ch[i]-'0');                          
            }
        }
        if(result == -1){
            return "";
        }
        return ""+result+result+result;
    }
}