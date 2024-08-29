class Solution {
    public int removeStones(int[][] stones) {
        int m = 0, n = 0;
        for(int[] i : stones) {
            m = Math.max(m, i[0]);
            n = Math.max(n, i[1]);
        }
        Set<Pair<Integer, Integer>> visit = new HashSet<>();
        int ans = 0;
        for(int[] i : stones) {
            if(!visit.contains(new Pair(i[0], i[1]))) ans += dfs(stones, visit, i[0], i[1]) - 1;
        }
        return ans;
    }
    public int dfs(int[][] stones, Set<Pair<Integer, Integer>> visit, int x, int y) {
        if(visit.contains(new Pair(x, y))) return 0;
        int total = 1;
        visit.add(new Pair(x, y));
        for(int i = 0; i < stones.length; i++) {
            int xi = stones[i][0];
            int yi = stones[i][1];
            if(xi == x || y == yi) total += dfs(stones, visit, xi, yi);
        }
        return total;
    }
}