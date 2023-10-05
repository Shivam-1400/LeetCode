class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer, Integer> mp= new HashMap<>();
        
        int mx=0;
        for(int x: nums){
            if(x%2==0){
                mp.put(x, mp.getOrDefault(x, 0)+1);
                mx= Math.max(mx, mp.get(x));
            }
        }
        int ans=Integer.MAX_VALUE;
        for(Map.Entry<Integer, Integer> t: mp.entrySet()){
            if(t.getValue()== mx){
                ans= Math.min(ans, t.getKey());
            }
        }
        if(ans== Integer.MAX_VALUE)return -1;
        
        return ans;
        
        
        
        
        
    }
}