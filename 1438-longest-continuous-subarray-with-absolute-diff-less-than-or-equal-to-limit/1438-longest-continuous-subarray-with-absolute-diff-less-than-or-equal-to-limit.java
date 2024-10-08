class Solution {
    public int longestSubarray(int[] nums, int limit) {
        TreeMap<Integer, Integer> m = new TreeMap<>();
        int res = 0, l = 0;
        for(int r = 0; r < nums.length; r++) {
            
            m.put(nums[r], m.getOrDefault(nums[r],0)+1);
            
            int diff = Math.abs(m.firstKey()-m.lastKey());
            if(diff <= limit) res = Math.max(res, r-l+1);

            while(!m.isEmpty() && diff > limit) {
                m.put(nums[l], m.get(nums[l])-1);
                if(m.get(nums[l])==0) m.remove(nums[l]);
                diff = Math.abs(m.firstKey()-m.lastKey());
                l++;
            }
        }
        return res;
    }
}