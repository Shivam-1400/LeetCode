class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> ax= new ArrayList<>();
        
        solve(0, nums, ax, ans);
        return ans;
        
        
    }
    void solve(int idx, int[] nums, List<Integer> ax, List<List<Integer>> ans){
        if(idx== nums.length){
            ans.add(new ArrayList<>(ax));
            return;
        }
        
        ax.add(nums[idx]);
        solve(idx+1, nums, ax, ans);
        ax.remove(Integer.valueOf(nums[idx]));
        solve(idx+1, nums, ax, ans);
    }
    
}