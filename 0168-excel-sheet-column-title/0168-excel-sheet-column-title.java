class Solution {
    public String convertToTitle(int columnNumber) {
        int n= columnNumber;
        if (n < 27) {
            return ""+(char)('A' + (n - 1) % 26);
        }

        String ans= "";
         
        StringBuilder c = new StringBuilder();
        while (n > 0) {
            if (n % 26 == 0) {
                ans=((char)('A'+ 25))+ ans;
                n -= 1;
            } else {
                ans= ((char)('A'+ n% 26- 1))+ ans;
            }
            n= n/26;
        }
        return ans;
    }
}