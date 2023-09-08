class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> ax= new ArrayList<>();
        int c=3;
        if(n==0){
            return ans;
        }
        ans.add(List.of(1));
        if(n==1){
            return ans;
        }
        ans.add(List.of(1,1));
        for(int i=2; i< n; i++){
            for(int j=0; j<c; j++){
                int a=0;
                if(j==0){
                    a= ans.get(i-1).get(j);
                }
                else if(j== c-1){
                    a= ans.get(i-1).get(j-1);
                }
                else{
                    a= ans.get(i-1).get(j)+ ans.get(i-1).get(j-1);
                }
                ax.add(a);
            }
            c++;
            ans.add(new ArrayList<>(ax));
            ax.clear();
        }
        return ans;
    }
}