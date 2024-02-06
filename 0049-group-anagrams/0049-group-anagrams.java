class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans= new ArrayList<>();
        
        Map<String, List<String>> mp= new HashMap<>();
        
        for(String x: strs){
            char[] chArr= x.toCharArray();
            Arrays.sort(chArr);
            String temp= new String(chArr);
            
            if(mp.containsKey(temp)){
                List<String> ls= mp.get(temp);
                ls.add(x);
                mp.put(temp, ls );
            }
            else{
                List<String> ls= new ArrayList<>();
                ls.add(x);
                mp.put(temp, ls);
            }
        }
        System.out.println(mp);
        for(List<String> l: mp.values()){
            ans.add(l);
        }
        
        return ans;
    }
}





























// class Solution {
//     public List<List<String>> groupAnagrams(String[] strs) {
//         List<List<String>> ans= new ArrayList<>();
//         HashMap<String, ArrayList<String>> map= new HashMap<>();
//         for(String s: strs){
//             char[] ch= s.toCharArray();
            
//             Arrays.sort(ch);
//             String sortedStr= new String(ch);
            
//             if(map.containsKey(sortedStr)){
//                 ArrayList<String> ls= map.get(sortedStr);
//                 ls.add(s);
//                 map.put(sortedStr, ls);
//             }
//             else{
//                 ArrayList<String> ls= new ArrayList<>();
//                 ls.add(s);
//                 map.put(sortedStr, ls);
//             }
//         }
        
//         for(String x: map.keySet()){
//             ans.add(new ArrayList<>(map.get(x)));
//         }
//         return ans;
//     }
// }