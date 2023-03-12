class Solution {
    public int search(int[] nums, int target) {
        int n= nums.length;
        int st=0; 
        int end=n;
        int mid= (st+end)/2;
        while(st<end){
            mid= (st+end)/2;
            if(nums[mid]== target){
                return mid;
            }
            if(nums[mid]> target){
                end= mid;
            }else{
                st= mid+1;
            }
        }
        return -1;
        
    }
}