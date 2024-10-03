class Solution {
    public int minSubarray(int[] nums, int p) {
        int n = nums.length;
        int totalSum = 0;
        
        for (int num : nums) {
            totalSum = (totalSum + num) % p;
        }
        
        if (totalSum == 0) {
            return 0;
        }

        int minLength = n;
        int currentSum = 0;
        HashMap<Integer, Integer> modMap = new HashMap<>();
        modMap.put(0, -1);  
        for (int i = 0; i < n; i++) {
            currentSum = (currentSum + nums[i]) % p;
            int targetMod = (currentSum - totalSum + p) % p;
            
            if (modMap.containsKey(targetMod)) {
                minLength = Math.min(minLength, i - modMap.get(targetMod));
            }
            modMap.put(currentSum, i);
        }
        return minLength == n ? -1 : minLength;
    }
}