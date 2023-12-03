class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int ans = 0;
        int n = points.length;
        int x = points[0][0], y = points[0][1];
        for (int i = 1; i < n; i++)
        {
            int diffx = Math.abs(points[i][0] - x);
            int diffy = Math.abs(points[i][1] - y);

            ans += Math.max(diffx, diffy);

            x = points[i][0];
            y = points[i][1];
        }
        return ans;
    }
}