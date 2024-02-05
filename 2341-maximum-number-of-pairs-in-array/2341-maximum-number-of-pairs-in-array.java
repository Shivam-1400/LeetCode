class Solution {
    public int[] numberOfPairs(int[] nums) {
        List<Integer> ans= new ArrayList<>();
        
        Map<Integer, Integer> mp= new HashMap<>();
        for(int x: nums){
            mp.put(x, mp.getOrDefault(x,0)+1);
        }
        int pairs= 0;
        int nonPair= 0;
        for(HashMap.Entry<Integer, Integer> x: mp.entrySet()){
                pairs+= x.getValue()/2;
                nonPair+=x.getValue()%2;
        }
        nums= new int[2];
        nums[0]= pairs;
        nums[1]= nonPair;
        return nums;
    }
}