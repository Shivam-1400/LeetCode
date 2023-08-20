/*
class Solution {
public:
    vector<int> maxSlidingWindow(vector<int>& nums, int k) {
           priority_queue<pair<int,int>>pq;
      vector<int>ans;
      for(int i=0;i<nums.size();i++){
          pq.push({nums[i],i});
          if(i>=(k-1)){
              while(i - pq.top().second >= k){
                  pq.pop();
              }
              ans.push_back(pq.top().first);
          }
      }  
      return ans;


    }
};
*/
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        List<Integer> ans= new ArrayList<>();
        PriorityQueue<Pair<Integer, Integer>> pq= new PriorityQueue<>((a,b)->b.getKey()-a.getKey());
        
        for(int i=0; i< nums.length; i++){
            // int[] ax= new int[]{nums[i], i};
            pq.add(new Pair<>(nums[i], i));
            
            if(i>=k-1){
                while(i- pq.peek().getValue() >=k){
                    pq.poll();
                }
                ans.add(pq.peek().getKey());
            }
        }
        // System.out.println(ans);
        int sz= ans.size();
        int[] ax= new int[sz];
        for(int i=0; i< sz; i++){
            ax[i]= ans.get(i);
        }
        return ax;
    }
    
//     public int[] maxSlidingWindow(int[] nums, int k) {
//         List<Integer> result = new ArrayList<>();
//         Deque<Integer> deque = new LinkedList<>();
        
//         for (int j = 0, i = 0; j < nums.length; j++) {
//             while (!deque.isEmpty() && deque.peekLast() < nums[j]) {
//                 deque.pollLast();
//             }
//             deque.offerLast(nums[j]);
            
//             if (j - i + 1 == k) {
//                 result.add(deque.peekFirst());
//                 if (deque.peekFirst() == nums[i]) {
//                     deque.pollFirst();
//                 }
//                 i++;
//             }
//         }
        
//         return result.stream().mapToInt(Integer::intValue).toArray();
//     }
}

