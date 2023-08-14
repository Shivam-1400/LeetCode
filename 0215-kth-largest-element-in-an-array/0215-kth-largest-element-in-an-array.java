class Solution {
//     public int findKthLargest(int[] nums, int k) {
//         PriorityQueue<Integer> pq= new PriorityQueue<>(Collections.reverseOrder());
        
//         for(int i=0; i< nums.length; i++){
//             pq.add(nums[i]);
//         }
        
//         while(k >1){
//             pq.poll();
//             k--;
//         }
//         return pq.peek();
//     }

    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for (int x : nums) {
            pq.add(x);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        
        return pq.peek();
    }
}