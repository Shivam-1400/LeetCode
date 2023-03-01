class Solution {
    public int[] leftRigthDifference(int[] nums) {
        int n= nums.length;
        int[] ans= new int[n];
        
        int[] l= new int[n];
        int[] r= new int[n];
        int sum=0;
        int s2=0;
        for(int i=0, j=n-1; i< n; i++, j--){
            l[i]= sum;
            sum= sum+ nums[i];
            
            r[j]= s2;
            s2= s2+ nums[j];
            
        }
        for(int i=0; i< n; i++){
            ans[i]= Math.abs(l[i]- r[i]);
        }
        return ans;
        
    }
}