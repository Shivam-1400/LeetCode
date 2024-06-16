class Solution {
    public int minPatches(int[] nums, int n) {
        int len=nums.length;
        int i=0;
        int output=0;
        long upto=0;
        while(upto<n){
            if(i<len && nums[i]<=upto+1){
                upto+=nums[i];
                i++;
            }else {
                upto+=(upto+1);
                output++;
                
            }

        }
        return output;
        
    }
}