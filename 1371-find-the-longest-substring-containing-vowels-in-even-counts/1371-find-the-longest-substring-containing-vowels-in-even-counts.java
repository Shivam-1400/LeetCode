class Solution {
    public int findTheLongestSubstring(String s) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int xor = 0;
        int ans = 0;
        int[] vowel = new int[26];
        vowel[0] = 1;
        vowel['e' - 'a'] = 2;
        vowel['i' - 'a'] = 4;
        vowel['o' - 'a'] = 8;
        vowel['u' - 'a'] = 16;
        for(int i = 0;i<s.length();i++){
            xor = xor ^ vowel[s.charAt(i) - 'a'];
            if(xor == 0) ans = i+1;
            if(map.containsKey(xor)) ans = Math.max(ans,i-map.get(xor));
            if(!map.containsKey(xor)) map.put(xor,i);
        }
        return ans;
    }
}