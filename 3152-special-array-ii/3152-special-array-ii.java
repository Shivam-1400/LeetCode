class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        TreeSet<Integer> set=new TreeSet<>();
        boolean ans[]=new boolean[queries.length];
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]%2==0){
                if(nums[i]%2==0){
                    set.add(i);
                }
            }
            else if(nums[i]%2!=0){
                set.add(i);
            }
        }
        
        for(int i=0;i<queries.length;i++){
            int from=queries[i][0];
            int to=queries[i][1];
            
            Integer result = set.floor(to);
            if(result==null || result<=from || from==to){
                ans[i]=true;
            }
            else{
                ans[i]=false;
            }
        }
        
        return ans;  
    }
}