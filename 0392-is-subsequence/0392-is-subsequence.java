class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0;
        int j=0;
        int count=0;
        for(; i<t.length() && j<s.length(); i++){
            if(t.charAt(i)== s.charAt(j)){
                j++;
                count++;
            }
        }
        if(count== s.length()){
            return true;
        }
        return false;
        
    }
}