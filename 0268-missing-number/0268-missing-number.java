class Solution {
    // public int missingNumber(int[] nums) {
    //     int n= nums.length;
    //     Arrays.sort(nums);
    //     int i;
    //     for(i=0; i< n; i++){
    //         if(i != nums[i]){
    //             return i;
    //         }
    //     }
    //     return  i;
    // }
    
    public int missingNumber(int[] nums){
        int n= nums.length;
        int sum=0;
        for(var i: nums){
            sum+= i;
        }
        return (n*(n+1)/2)- sum;
    }
}