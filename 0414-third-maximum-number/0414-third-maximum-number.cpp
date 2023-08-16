class Solution {
public:
    int thirdMax(vector<int>& arr) {
        set<int> set(arr.begin(), arr.end());
        vector<int> nums(set.begin(), set.end());
        int n = nums.size();
        int ans = INT_MIN;
        if(n==1){
            return nums[0];
        }
        if(n==2){
            return max(nums[0], nums[1]);
        }
        return nums[n-3];
        
        // else{
        //     int f = nums[0];
        //     for(int i=1; i<n; i++){
        //         if(nums[i] > f){
        //             f = nums[i];
        //         }
        //     }
        //     int s = INT_MIN;
        //     for(int i=0; i<n; i++){
        //         if(nums[i] > s && nums[i] < f){
        //             s = nums[i];
        //         }
        //     }
        //     for(int i=0; i<n; i++){
        //         if(nums[i] > ans && nums[i] < s){
        //             ans = nums[i];
        //         }
        //     }
        // }
        // return ans;
    }
};