class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int n = nums.length;
        int[] res = new int[n - k + 1];
        for (int i = 0; i <= n - k; i++) {
            for (int j = 0; j < k - 1; j++) {
                if (nums[i + j] != (nums[i + j + 1] - 1)) {
                    res[i] = -1;
                    break;
                }
            }
            res[i] = res[i] == -1 ? -1 : nums[i + k - 1];
        }
        return res;
    }
}