class Solution {
    public int[] findErrorNums(int[] nums) {
        Set<Integer> st= new HashSet<>();
        int ans[]= new int[2];
        for(int a: nums){
            if(st.contains(a)){
                ans[0]= a;
            }
            st.add(a);
        }
        List<Integer> ls= new ArrayList<>(st);
        for(int i=0; i<nums.length-1; i++){
            if(i+1 != ls.get(i)){
                ans[1]= i+1;
                break;
            }
        }
        if(ans[1]== 0){
            ans[1]= nums.length;
        }
        return ans;
    }
}