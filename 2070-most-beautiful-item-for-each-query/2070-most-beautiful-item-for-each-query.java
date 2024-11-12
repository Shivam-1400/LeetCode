class Solution {
    public int[] maximumBeauty(int[][] items, int[] queries) {
        int n = queries.length;
        Integer[] qid = new Integer[n]; 
        
        for (int i = 0; i < n; i++) {
            qid[i] = i;
        }

        Arrays.sort(qid, (a, b) -> Integer.compare(queries[a], queries[b]));

        Arrays.sort(items, (a, b) -> Integer.compare(a[0], b[0]));

        int x = 0, i = 0;
        int[] ans = new int[n];

        for (int q : qid) {
            while (i < items.length && items[i][0] <= queries[q]) {
                x = Math.max(x, items[i][1]);
                ++i;
            }
            ans[q] = x;
        }
        return ans;
    }
}