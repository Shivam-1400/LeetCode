class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int result = 0;
        int leftFar = 0;
        int leftNear = 0;
        

        for(int right = 0;right<nums.length;right++){
            map.put(nums[right], map.getOrDefault(nums[right], 0)+1);

            while(map.size()>k){
                map.put(nums[leftNear], map.get(nums[leftNear])-1);
                if(map.get(nums[leftNear]) == 0){
                    map.remove(nums[leftNear]);
                }
                leftNear++;
                leftFar = leftNear;
            }

            while(map.get(nums[leftNear])>1){
                map.put(nums[leftNear], map.get(nums[leftNear])-1);
                leftNear++;
            }
            if(map.size()==k){
                result += leftNear - leftFar + 1;
            }
        }

        return result;
    }
}