class Solution {
    public int solve(int index, int[] nums, HashMap<Integer, Integer> map, int k) {
        if (index == nums.length) {
            if (map.size() != 0){ 
                return 1;
            }
            return 0;
        }
        int include = 0;
        
        if (!map.containsKey(nums[index] + k) && !map.containsKey(nums[index] - k)) {
            map.put(nums[index], map.getOrDefault(nums[index], 0) + 1);
            include = solve(index + 1, nums, map, k);
            
            map.put(nums[index], map.get(nums[index]) - 1);
            if (map.get(nums[index]) == 0){ 
                map.remove(nums[index]);
            }
        }
        int exclude = solve(index + 1, nums, map, k);

        return include + exclude;
    }

    public int beautifulSubsets(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        return solve(0, nums, map, k);
    }
}