class Solution {
    public boolean divideArray(int[] nums) {
        Map<Integer, Integer> mp= new HashMap<>();
        for(int x: nums){
            mp.put(x, mp.getOrDefault(x, 0)+1);
        }
        for(int x: mp.values()){
            if(x%2 !=0){
                return false;
            }
            
        }
        return true;
    }
}