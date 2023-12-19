// class Solution {
//     public int countQuadruplets(int[] nums) {
//         int n= nums.length;
//         int sm=0;
//         int c=0;
//         for(int i=0; i+3< n; i++){
//             // for(int j=0; j<4; j++){
//                 if(nums[i]+ nums[i+1]+ nums[i+2]== nums[i+3]){
//                     c++;
//                 }
//             // }
//         }
//         return c;
//     }
// }

class Solution {
    int solve(int[] nums, int idx, int tk, int sm, int count){
        if(idx>= nums.length){
            return count;
        }
        
        if(tk==3){
            if(sm== nums[idx]){
                count++;
            }
            count= solve(nums, idx+1, tk, sm, count);
            return count;
        }
        
        count= solve(nums, idx+1, tk+1, sm+nums[idx], count);
        
        count= solve(nums, idx+1, tk, sm, count);
        
        
        
        return count;
        
        
    }
    public int countQuadruplets(int[] nums) {
        int count=0;
        int ans= solve(nums, 0, 0, 0, count);
        return ans;
    }
}