class Solution {
    public String makeFancyString(String s) {
        StringBuilder ans = new StringBuilder();
        int idx = 0;
        while(idx < s.length()){
            char c = s.charAt(idx++);
            int cnt = 1;
            while(idx < s.length() && s.charAt(idx) == c){
                idx++; cnt++;
            }
            ans.append(c);
            if(cnt > 1){
                ans.append(c);                
            }
        }
        return ans.toString();
    }
}