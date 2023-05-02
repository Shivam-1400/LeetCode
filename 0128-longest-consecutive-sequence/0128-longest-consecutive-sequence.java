class Solution {
    public int longestConsecutive(int[] nums) {
        int n= nums.length;
        if(n==0)
            return 0;
//         for(int i=0; i< n-1; i++){
            
//         }
        
        Arrays.sort(nums);
        int ans=0;
        int nc=1;
        
        for(int i=0; i< n-1; i++){
            if(nums[i]+1 == nums[i+1]){
                // System.out.println(nums[i]+" "+ nums[i+1]+ " count="+ nc);
                nc++;
            }
            else if(nums[i]== nums[i+1]){
                
            }
            else{
                ans= Math.max(ans, nc);
                nc=1;
            }
        }
        ans= Math.max(ans, nc);
        
        return ans;
    }
}