class Solution {
    public int minOperations(int[] nums, int k) {
        int finalxor = 0;

        for (int i : nums) {
            finalxor ^= i;
        }

        int count = 0;

        while (k > 0 || finalxor > 0) {
            if ((k & 1) != (finalxor & 1)) {
                count++;
            }

            k >>= 1;
            finalxor >>= 1;
        }

        return count;
    }
}