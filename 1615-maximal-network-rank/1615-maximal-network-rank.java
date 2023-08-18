class Solution {
    public int maximalNetworkRank(int n, int[][] roads) {
        List<Integer>[] axx = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            axx[i] = new ArrayList<>();
        }
        
        for (int[] road : roads) {
            int a = road[0];
            int b = road[1];
            axx[a].add(b);
            axx[b].add(a);
        }
        
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int rank = axx[i].size() + axx[j].size();
                if (axx[i].contains(j) || axx[j].contains(i)) {
                    rank--;
                }
                ans = Math.max(ans, rank);
            }
        }
        
        return ans;
    }
}
