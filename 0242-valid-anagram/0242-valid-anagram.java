class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        char[] sz= s.toCharArray();
        char tz[]= t.toCharArray();
        
        Arrays.sort(sz);
        Arrays.sort(tz);
        
        for(int i=0; i< sz.length; i++){
            if(sz[i] != tz[i]){
                return false;
            }
        }
        return true;
    }
}