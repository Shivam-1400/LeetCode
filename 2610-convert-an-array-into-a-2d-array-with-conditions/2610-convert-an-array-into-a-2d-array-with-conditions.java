class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        Map<Integer, Integer> mp= new HashMap<>();
        for(int nm: nums){
            mp.put(nm, mp.getOrDefault(nm, 0)+1);
        }
        System.out.println(mp);
        List<List<Integer>> ans= new ArrayList<>();
        
        for(Map.Entry<Integer, Integer> x: mp.entrySet()){
            int nm= x.getKey();
            int cnt= x.getValue();
            
            if(ans.size()< cnt){
                while(ans.size()< cnt){
                    ans.add(new ArrayList<>());
                }
            }
            for(int i=0; i< cnt; i++){
                ans.get(i).add(nm);
            }
        }
        System.out.println(ans);
        
        return ans;
        
    }
}