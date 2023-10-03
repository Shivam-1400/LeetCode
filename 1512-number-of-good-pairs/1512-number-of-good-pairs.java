class Solution {
    public int numIdenticalPairs(int[] nums){
        // int ans[]= new int[101];
        Map<Integer, Integer> mp= new HashMap<>();
        
        for(int x: nums){
            mp.put(x, mp.getOrDefault(x, 0)+1);
        }
        int ans=0;
        for(Map.Entry<Integer, Integer> et: mp.entrySet()){
            int p= et.getValue();
            ans= ans+ (p*(p-1))/2;
        }
        return ans;
    }
    
    
    
//     public int numIdenticalPairs(int[] nums) {
//         int ans=0;
        
//         int n= nums.length;
        
//         for(int i=0; i< n; i++){
//             for(int j=i+1; j<n; j++){
//                 if(nums[i]== nums[j])
//                     ans++;
//             }
//         }
//         return ans;
//     }
}