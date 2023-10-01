class Solution {
    public int firstMissingPositive(int[] nums) {
        Map<Integer, Integer> mp= new HashMap<>();
        
        for(int x: nums){
            mp.put(x, mp.getOrDefault(x,0)+1);
        }
        System.out.println(mp);
        for(int i=1;  ; i++){
            if(mp.containsKey(i)){
                
            }
            else{
                return i;
            }
        }
        // return 0;
    }
}