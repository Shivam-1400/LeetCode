class Solution {
    public int minOperations(int[] nums) {
        Arrays.sort(nums);
        int ans= 0;
        int freq= 1;
        int i=0;
        for(i=0; i+1< nums.length; i++){
            if(nums[i]== nums[i+1]){
                freq++;
            }
            else{  
                System.out.println(nums[i]+" "+freq+" "+ solve(freq));
                ans+= solve(freq);
                if(freq==1){
                    return -1;
                }
                freq= 1;
            }
        }
        System.out.println(nums[i]+" "+freq+" "+ solve(freq));
        if(freq==1){
            return -1;
        }
        return ans+ solve(freq);
    }
    int solve(int n){
        if(n%3== 0){
            return n/3;
        }
        else{
            return n/3 +1;
        }
    }
}