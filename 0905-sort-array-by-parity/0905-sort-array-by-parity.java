class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n= nums.length;
        
        List<Integer> ax= new ArrayList<>();
        for(int i: nums){
            if(i%2==0){
                ax.add(0, i);
            }
            else{
                ax.add(i);
            }
        }
        int j=0;
        for(int i: ax){
            nums[j++]= i;
        }
        return nums;
    }
}