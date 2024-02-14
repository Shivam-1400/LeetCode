class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int i = 0, j = 0;
        int[] ans = new int[n];
        int pos = 0, neg = 0;
        if (nums[0] > 0) {
            pos = 0;
            while (nums[neg] > 0)
                neg++;
        } else {
            while (nums[pos] < 0)
                pos++;
        }
        
        boolean check = true;
        while (j < n) {
            if (check) {
                ans[j] = nums[pos++];
                while (pos < n && nums[pos] < 0)
                    pos++;
            } else {
                ans[j] = nums[neg++];
                while (neg < n && nums[neg] > 0)
                    neg++;
            }
            j++;
            check = !check; 
        }
        return ans;
    }
}