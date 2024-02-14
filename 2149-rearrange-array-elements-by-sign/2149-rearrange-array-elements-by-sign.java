class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int pos = 0, neg = 1;
        for (int a : nums) {
            if (a >= 0) {
                ans[pos] = a;
                pos += 2;
            } 
            else {
                ans[neg] = a;
                neg += 2;
            }
        }

        return ans;
    }
}