// class Solution {
//     public int rob(int[] nums) {
//         return get(nums, nums.length-1);
//     }
//     int get(int[] nums, int n){
//         if(n<0){
//             return 0;
//         }

//         int ans= Math.max(get(nums, n-1), get(nums, n-2)+ nums[n]);
        
//         return ans;
        
        
//     }
// }

class Solution {
    // int memo[];
//     public int rob(int[] nums) {
//         memo= new int[nums.length];
//         Arrays.fill(memo, -1);
//         return get(nums, nums.length-1);
//     }
//     int get(int[] nums, int n){
//         if(n<0){
//             return 0;
//         }
//         if(memo[n] != -1){
//             return memo[n];
//         }
//         memo[n]= Math.max(nums[n]+ get(nums, n-2), get(nums, n-1));
        
//         return memo[n];
//     }
    
    public int rob(int[] houses) {
		//Your code goes here
		int n= houses.length;
		if(n==0){
			return 0;
		}
		if(n==1){
			return houses[0];
		}
		int prev2= houses[0];
		int prev= Math.max(houses[1], houses[0]);

		for(int i=2; i<n; i++){
			int rob= houses[i]+ prev2;
			int notRob= prev;

			int cur= Math.max(rob, notRob);
			prev2= prev;
			prev= cur;
		}
		return prev;
	}
    
    
    
}











