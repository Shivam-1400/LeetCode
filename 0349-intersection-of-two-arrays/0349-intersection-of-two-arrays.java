class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> st= new HashSet<>();
        for(int a: nums1){
            st.add(a);
        }
        List<Integer> ls= new ArrayList<>();
        
        for(int a: nums2){
            if(st.contains(a)){
                ls.add(a);
                st.remove(a);
            }
        }
        
        int sz= ls.size();
        int ans[]= new int[sz];
        for(int i=0; i< sz;i++){
            ans[i]= ls.get(i);
        }
        return ans;
                
    }
}