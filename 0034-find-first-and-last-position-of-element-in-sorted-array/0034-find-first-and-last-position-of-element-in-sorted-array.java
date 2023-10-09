public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = getFirst(nums, target);
        result[1] = getLast(nums, target);
        return result;
    }

    private int getFirst(int[] nums, int target){
        int idx = -1;
        int l = 0;
        int h = nums.length - 1;
        while(l <= h){
            int mid = (l + h) / 2;
            if(nums[mid] >= target){
                h = mid - 1;
            }else{
                l = mid + 1;
            }
            if(nums[mid] == target) idx = mid;
        }
        return idx;
    }

    private int getLast(int[] nums, int target){
        int idx = -1;
        int l = 0;
        int h = nums.length - 1;
        while(l <= h){
            int mid = (l + h) / 2;
            if(nums[mid] <= target){
                l = mid + 1;
            }else{
                h = mid - 1;
            }
            if(nums[mid] == target) idx = mid;
        }
        return idx;
    }
}