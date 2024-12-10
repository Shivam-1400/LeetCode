class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();

        for(int i = 0, j = 0; i < n; i++) {
            if(str1.charAt(i) == str2.charAt(j) || (str1.charAt(i) == 'z' && str2.charAt(j) == 'a') || (char)(str1.charAt(i) + 1) == str2.charAt(j)) j++;
            if(j == m) return true;
        }

        return false;
    }
}