class Solution {
    // public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
    //     String a= "";
    //     for(String x: word1){
    //         a+= x;
    //     }
    //     String b= "";
    //     for(String x: word2){
    //         b+= x;
    //     }
    //     return a.equals(b);
    // }
    
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int n1= word1.length;
        int n2= word2.length;
        
        int i=0, j=0;
        int l=0, m=0;
        
        while(i< n1){            
            if(l== word1[i].length()){
                l =0;
                i++;
            }
            if(m== word2[j].length()){
                m= 0;
                j++;
            }  
            if(i== n1 && j== n2){
                return true;
            }
            if(i== n1 || j== n2){
                return false;
            }
            
            if(word1[i].charAt(l) != word2[j].charAt(m)){
                return false;
            }           
            l++;
            m++;
        }
        return true;
    }
}