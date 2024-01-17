class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> mp= new HashMap<>();
        for(int x: arr){
            mp.put(x, mp.getOrDefault(x, 0)+1);
        }
        Set<Integer> st= new HashSet<>();
        for(Map.Entry<Integer, Integer> et: mp.entrySet()){
            st.add(et.getValue());
        }
        return mp.size()== st.size();
    }
}