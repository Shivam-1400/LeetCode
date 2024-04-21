class Solution {
    int[] par;
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        par = new int[n];
        for(int i = 0; i < n; i++){
            par[i] = i;
        }
        for(int[] edge : edges){
            int pu = find(edge[0]);
            int pv = find(edge[1]);
            if(pu != pv){
                par[pu] = pv;
            }
        }
        return find(source) == find(destination);
    }

    public int find(int val){
        if(par[val] == val){
            return val;
        }
        return par[val] = find(par[val]);
    }
}