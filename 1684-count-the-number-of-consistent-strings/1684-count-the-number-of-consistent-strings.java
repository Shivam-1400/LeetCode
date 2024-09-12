class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> st= new HashSet<>();
        
        for(char a: allowed.toCharArray()){
            st.add(a);
        }
        int ans=0;
        for(String w: words){
            int flag= 0;
            for(char a: w.toCharArray()){
                if(!st.contains(a)){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                ans++;
            }
        }
        return ans;
    }
}