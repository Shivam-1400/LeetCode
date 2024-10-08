class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int maxLen = 0;
        int left = 0, right = 0;
        int cost = 0;
        
        while (right < s.length()) {
            int diff = Math.abs(s.charAt(right) - t.charAt(right));
            cost += diff;
            while (cost > maxCost) {
                cost -= Math.abs(s.charAt(left) - t.charAt(left));
                left++;
            }
            int len = right - left + 1;
            if (len > maxLen) {
                maxLen = len;
            }
            right++;
        }

        return maxLen;
    }
}