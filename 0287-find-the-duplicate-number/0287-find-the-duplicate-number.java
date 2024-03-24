class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> mp= new HashSet<>();
        
        for(int a: nums){
            if(mp.contains(a)){
                System.out.println(mp);
                return a;
            }
            mp.add(a);
        }
        return 1;
    }
}