class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        // List<List<Integer>> adj= new ArrayList<List<Integer>>();
        
        int[] aa= new int[n];
        int m= edges.size();
        for(int i=0; i< m; i++){
            List<Integer> ai= edges.get(i);
            int src= ai.get(0);
            int des= ai.get(1);
            
            aa[des]=2;
            
        }
        List<Integer> ans= new ArrayList<>();
        for(int i=0; i< n; i++){
            if(aa[i] != 2){
                ans.add(i);
            }
        }
        return ans;
    }
}