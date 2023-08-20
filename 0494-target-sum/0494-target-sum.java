class Solution {
    int count=0;
    public int findTargetSumWays(int[] nums, int target) {
        solve(nums, 0, 0, target);
        return count;
       
    }
    void solve(int[] nums, int idx, int sm, int target){
        
//         int n = nums.length;
//         if (idx == n)
//            return sm == target ? 1 : 0;
        
        
        
        // if(sm> target){
        //     return;
        // }
        if(idx== nums.length){
            if(sm == target){
                count++;
            }
            return;
        }
        
        // int a=
        solve(nums, idx+1, sm+nums[idx], target);
        // int b=
        solve(nums, idx+1, sm-nums[idx], target);
        // return a+b;
    }
}