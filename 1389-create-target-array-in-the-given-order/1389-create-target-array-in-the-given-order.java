class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> a= new ArrayList<>();
        for(int i=0; i< nums.length; i++){
            a.add(index[i], nums[i]);
        }
        int[] ans= new int[a.size()];
        for(int i=0;i< a.size(); i++){
            ans[i]= a.get(i);
        }
        return ans;
        
    }
}