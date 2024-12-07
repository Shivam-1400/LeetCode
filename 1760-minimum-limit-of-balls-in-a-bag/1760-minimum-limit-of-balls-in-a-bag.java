class Solution {
    public boolean helper(int[] nums,int n,int maxOperations,int x){
        int operations=0;
        for(int i=0;i<n;i++) operations+=(nums[i]+x-1)/x-1;
        return operations<=maxOperations;
    }
    public int minimumSize(int[] nums, int maxOperations){
        int low=1,high=Integer.MAX_VALUE,n=nums.length;
        while(low<=high){
            int mid=low+((high-low)/2);
            boolean check=helper(nums,n,maxOperations,mid);
            if(check) high=mid-1;
            else low=mid+1;
        }
        return low;
    }
}