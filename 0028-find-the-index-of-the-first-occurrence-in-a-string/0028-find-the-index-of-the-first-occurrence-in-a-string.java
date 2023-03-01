class Solution {
    public int strStr(String h, String ne) {
        int n= h.length();
        int m= ne.length();
        if(m==0){
            return 0;
        }
        int i;
        for(i=0; i<=n-m; i++){
            if(h.charAt(i)== ne.charAt(0)){
                int j=0;
                while(j<m && h.charAt(i+j)== ne.charAt(j) ){
                    if(h.charAt(i+j)== ne.charAt(j)){
                        j++;
                    }else{
                        break;
                    }
                }
                if(j==m){
                    return i;
                }
            }
            
        }
        return -1;
        
        
        
        // return n-m;
        
        
    }
}