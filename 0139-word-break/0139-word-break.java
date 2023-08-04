class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> set= new HashSet<>(wordDict);
        Map<String, Boolean> mp= new HashMap<>();
        return solve(s, set, mp);
        
    }
    boolean solve(String s, Set<String> set, Map<String, Boolean> mp){
        if(s.length()==0){
            return true;
        }
        if(mp.containsKey(s)){
            return mp.get(s);
        }

        for(int i=1; i<=s.length(); i++){
            String ax= s.substring(0, i);
            if(set.contains(ax)){
                if(solve(s.substring(i), set, mp)){
                    mp.put(s, true);
                    return true;
                }
            }
        }
        mp.put(s, false);
        return false;
    }
}