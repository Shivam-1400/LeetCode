class Solution {
    public int minOperations(int[] nums, int x) {
        int n= nums.length;
        int sm=0;
        Map<Integer, Integer> mpPrefix= new HashMap<>();
        for(int i=0; i< n; i++){
            sm+= nums[i];
            mpPrefix.put(sm ,i+1);
        }
        // System.out.println(mpPrefix);
        sm=0;
        Map<Integer, Integer> mpSuffix= new HashMap<>();
        for(int i=n-1; i>=0; i--){
            sm+= nums[i];
            mpSuffix.put(sm ,n-i);
        }
        // System.out.println(mpSuffix);

        int pidx= Integer.MAX_VALUE;
        int sidx= Integer.MAX_VALUE;
        if(mpPrefix.containsKey(x)){
            pidx= mpPrefix.get(x);
        }
        if(mpSuffix.containsKey(x)){
            sidx= mpSuffix.get(x);
        }
        // System.out.println(pidx+" "+ sidx);
        int ans= Math.min(pidx, sidx);
        
        int target= x;
        for(Map.Entry<Integer, Integer> ax: mpPrefix.entrySet()){
            int fnd= x- ax.getKey();
            if(mpSuffix.containsKey(fnd) && ax.getValue()+ mpSuffix.get(fnd)< n){
                ans= Math.min(ans, ax.getValue()+ mpSuffix.get(fnd));
            }
            
        }
        
        
//         for (auto c:mpr)
//         {
//             int fnd=x-c.first;
//             if(mps[fnd]>0 &&(c.second+mps[fnd])<n )
//             {
//                 ans=min(ans,c.second+mps[fnd]);
//             }
            
//         }
        
//         System.out.println(pid+sid);
        
        
//         int ans= Math.min(pidx, Math.min(sidx, Integer.MAX_VALUE));
        if(ans== Integer.MAX_VALUE){
            return -1;
        }
        return ans;
    }

}

// class Solution {
//     public int minOperations(int[] nums, int x) {
//         int n= nums.length;
//         int conut= 0;
//         int ans= solve(x, 0, nums, 0, n-1, 0);
//         if(ans== Integer.MAX_VALUE){
//             return -1;
//         }
//         return ans;
         
//     }
//     int solve(int target, int sum, int[] nums, int st, int ed, int count){
//         if(sum> target){
//             return Integer.MAX_VALUE;
//         }
//         if(sum== target){
//             return count;
//         }
//         int c1= Integer.MAX_VALUE;
//         int c2= Integer.MAX_VALUE;
//         if(nums[st]<=target && st<ed){
//             c1= solve(target, sum+ nums[st], nums, st+1, ed, count+1);
//         }
//         if(nums[ed]<=target && ed> st){
//             c2= solve(target, sum+nums[ed], nums, st, ed-1, count+1);
//         }
//         return Math.min(c1, c2);   
//     }
// }