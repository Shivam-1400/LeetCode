class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans= new ArrayList<>();
        if(digits.length()==0){
            return ans;
        }
        String digAZ[]= {" ", "", "abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        int n= digits.length();
        solve("", digits, digAZ, ans);
        return ans;
        
    }
    void solve(String curr, String digits, String[] digAZ, List<String> ans){
        if (digits.isEmpty()) {
            ans.add(curr);
        }
        else{
            String letter= digAZ[digits.charAt(0)-'0'];
            for(char x: letter.toCharArray()){
                solve(curr+ x, digits.substring(1), digAZ, ans);
            }
        }
    }
    
}