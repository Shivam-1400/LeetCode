class Solution {
    public String convert(String s, int numRows) {
        int n= numRows-1;

        if(numRows==1){
            return s;
        }

        String[] ans= new String[numRows];
        for(int i=0; i< numRows; i++){
            ans[i]="";
        }
        int up=0;
        int down=1;

        int j=0;
        for(int i=0; i< s.length(); i++){
            if(down==1){
                ans[j]= ans[j]+ s.charAt(i);
                
                if(j== n){
                    down=0;
                    // up=1;
                    j--;
                    j--;
                }
                j++;
                
            }
            else{
                ans[j]= ans[j]+ s.charAt(i);
                
                if(j==0){
                    // up=0;
                    down=1;
                    j++;
                    j++;
                }
                j--;
            }
        }
        String a="";
        for(int i=0; i< numRows; i++){
            // System.out.println(ans[i]+" "+i);
            a= a+ ans[i];
        }
        return a;



    }
}