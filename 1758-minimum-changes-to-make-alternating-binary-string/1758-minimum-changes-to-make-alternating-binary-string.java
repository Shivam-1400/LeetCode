class Solution {
    public int minOperations(String s) {
        int n= s.length();
        int zc= 0;
        int oc= 0;
        for(int i=0; i< n; i++){
            if(i%2== 0){
                if(s.charAt(i)=='0'){
                    zc++;
                }
                else{
                    oc++;
                }
            }
            else{
                if(s.charAt(i)== '1'){
                    zc++;
                }
                else{
                    oc++;
                }
            }
        }
        
        return Math.min(zc, oc);
    }
}