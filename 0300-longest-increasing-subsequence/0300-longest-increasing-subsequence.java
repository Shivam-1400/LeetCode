class Solution {
    public int lengthOfLIS(int[] nums) {
        int n= nums.length;
        int ans[]= new int[n+1];
        Arrays.fill(ans, 1);
        
        for(int i= 1; i< n; i++){
            for(int j= 0; j< i; j++){
                if(nums[i]> nums[j]){
                    ans[i]= Math.max(ans[j]+1, ans[i]);
                }
            }
        }
        Arrays.sort(ans);
        return ans[n];
        
    }
}