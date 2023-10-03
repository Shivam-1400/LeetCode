class Solution {
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> st= new HashSet<>();
        for(int i: nums){
            st.add(i);
            int x= getRev(i);
            st.add(x);
        }
        return st.size();
    }
    int getRev(int n){
        int ans=0;
        while(n>0){
            ans= ans*10+ n%10;
            n= n/10;
        }
        return ans;
    }
}