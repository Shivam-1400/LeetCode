class Solution {
    public int minSteps(String s, String t) {
        int[] sa= new int[26];
        for(char x: s.toCharArray()){
            sa[x-'a']++;
        }
        
        int[] ta= new int[26];
        for(char x: t.toCharArray()){
            ta[x-'a']++;
        }
        int ans= 0;
        for(int i=0; i< 26; i++){
            ans+= Math.abs(sa[i]- ta[i]);
        }
        return ans/2;
    }
}
