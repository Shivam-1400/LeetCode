class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> mp= new HashMap<>();
        for(int x: nums){
            mp.put(x, mp.getOrDefault(x, 0)+1);
        }
        int x= nums.length/3;
        
        List<Integer> ans= new ArrayList<>();
        
        for(Map.Entry<Integer, Integer> t: mp.entrySet()){
            if(t.getValue() > x){
                ans.add(t.getKey());
            }
        }
        return ans;
        
        
    }
}