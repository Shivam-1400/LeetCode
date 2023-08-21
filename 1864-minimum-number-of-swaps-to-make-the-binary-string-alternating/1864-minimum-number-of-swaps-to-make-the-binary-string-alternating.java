class Solution {
    public int minSwaps(String s) {
        int l= s.length();
        int c0=0;
        for(int i=0; i< l; i++){
            if(s.charAt(i)=='0'){
                c0++;
            }
        }    
        int c1= l- c0;
        if(Math.abs(c0-c1) >1){
            return -1;
        }
        if(l%2 ==0){
            int odd1=0;
            int even1=0;
            for(int i=0; i< l; i++){
                if(s.charAt(i)=='1'){
                    if(i%2==0){
                        even1++;
                    }
                    else{
                        odd1++;
                    }
                }
            }
            return Math.min(even1, odd1);
        }
        else{
            if(c1>c0){
                int odd1=0;
                for(int i=0; i< l; i++){
                    if(i%2==1 && s.charAt(i)=='1'){
                            odd1++;
                        }
                    }
                
                return odd1;
            }
            else{
                int odd0=0;
                for(int i=0; i< l; i++){
                    if(i%2==1 && s.charAt(i)=='0'){
                            odd0++;
                        }
                    }
                
                return odd0;
            }
        }
    }
    
}