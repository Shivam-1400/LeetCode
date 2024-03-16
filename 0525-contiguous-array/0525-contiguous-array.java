class Solution {
    public int findMaxLength(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                nums[i]=-1;
            }
        }
        HashMap<Integer,Integer> hm=new HashMap<>();
        int sum=0,res=0;
        
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum==0) res=i+1;
            
            if(hm.containsKey(sum)){
                int x=hm.get(sum);

                res=Math.max(res,i-x);
                continue;
            }
            hm.put(sum,i);
        }
        return res;
    }
}