class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans= new ArrayList<>();
        HashMap<String, ArrayList<String>> map= new HashMap<>();
        for(String s: strs){
            char[] ch= s.toCharArray();
            
            Arrays.sort(ch);
            String sortedStr= new String(ch);
            
            if(map.containsKey(sortedStr)){
                ArrayList<String> ls= map.get(sortedStr);
                ls.add(s);
                map.put(sortedStr, ls);
            }
            else{
                ArrayList<String> ls= new ArrayList<>();
                ls.add(s);
                map.put(sortedStr, ls);
            }
        }
        
        for(String x: map.keySet()){
            ans.add(new ArrayList<>(map.get(x)));
        }
        return ans;
    }
}