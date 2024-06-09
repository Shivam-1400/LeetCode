class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer,Integer> prefixSumCount = new HashMap<>();
        prefixSumCount.put(0,1);
        int count =0;
        int sum =0;

        for(int i : nums){
            sum += i;
            int mod = (sum %k +k) % k;
            count +=  prefixSumCount.getOrDefault(mod, 0);
            prefixSumCount.put(mod,prefixSumCount.getOrDefault(mod,0)+1);
        }
        return count;
    }
}