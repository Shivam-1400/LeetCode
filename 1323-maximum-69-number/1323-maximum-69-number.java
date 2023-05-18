class Solution {
    public int maximum69Number (int num) {
        
        String ax= num+"";
        String ans="";
        int i=0;
        int n= ax.length();
        for(i=0; i< n; i++){
            if(ax.charAt(i)=='6'){
                ans+= '9';
                i++;
                break;
            }
            else{
                ans+= ax.charAt(i);
            }
        }
        for(; i< n; i++){
            ans+= ax.charAt(i);
        }
        
        int ansx= Integer.parseInt(ans);
        return ansx;
    }
}