class Solution {
    public void moveZeroes(int[] nums) {
        int k=0;
        int j= nums.length-1;
        for(int i=0; i<=j; i++){
            if(nums[i]!=0){
                nums[k++]= nums[i];
            }
        }
        for(; k<=j; k++){
            nums[k]=0;
        }

    }
}