class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n= nums.length;
        int ans[]= new int[2];
        int i=0;
        int j= n-1;
        while(i<j){
            if(nums[i]+nums[j]== target){
                ans[0]=i+1;
                ans[1]=j+1;
                return ans;
            }
            if(nums[j]>target- nums[i]){
                j--;
            }
            else if(nums[i]< target- nums[j]){
                i++;
            }
        }
        return ans;
    }
}