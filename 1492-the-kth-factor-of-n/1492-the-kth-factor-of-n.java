class Solution {
    public int kthFactor(int n, int k) {
        Set<Integer> st= new TreeSet<>();
        for(int i=1; i<=n; i++){
            if(n%i ==0){
                int b= n/i;
                if(st.contains(b)){
                    break;
                }
                st.add(i);
                st.add(b);
            }
        }
        List<Integer> ls= new ArrayList<>(st);
        if(k<=ls.size()){
            return ls.get(k-1);
        }
        return -1;
    }
}