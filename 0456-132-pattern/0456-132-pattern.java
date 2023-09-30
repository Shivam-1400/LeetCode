class Solution {        
    public boolean find132pattern(int[] nums) {
        int n= nums.length;
        int[] arr = Arrays.copyOf(nums, n);

        for (int i = 1; i < n; i++) {
            arr[i] = Math.min(nums[i - 1], arr[i - 1]);
        }

        for (int j = n - 1, top = n; j >= 0; j--) {
            if (nums[j] <= arr[j]) continue;
            while (top < nums.length && arr[top] <= arr[j]) top++;
            if (top < nums.length && nums[j] > arr[top]) return true;
            arr[--top] = nums[j];
        }

        return false;
}
}