class Solution {
    public int maximumCount(int[] nums) {
        int p=0;
        int n=0;
        for(int i: nums){
            if(i< 0){
                n++;
            }else if(i>0){
                p++;
            }
        }
        return n>p?n: p;
    }
}