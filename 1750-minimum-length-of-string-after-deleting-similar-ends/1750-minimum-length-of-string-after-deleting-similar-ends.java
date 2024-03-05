class Solution {
    public int minimumLength(String s) {
        int i = 0;
        int j = s.length()-1;
        while(i < j) {
            if(s.charAt(i) == s.charAt(j)) {
                if(j == i+1) return 0;
                if(s.charAt(i) == s.charAt(i+1)) {
                    i++;
                } else if(s.charAt(j) == s.charAt(j-1)) {
                    j--;
                } else {
                    i++;
                    j--;
                }
            } else break;
        }
        return j-i+1;
    }
}