class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans= new ArrayList<>();
        Set<Integer> st= new HashSet<>();
        for(int a: nums){
            if(st.contains(a)){
                ans.add(a);
            }
            else{
                st.add(a);
            }
        }
        return ans;
    }
}