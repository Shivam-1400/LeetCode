import java.util.Arrays;

class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int n = profits.length;
        int[][] projects = new int[n][2];
        for (int i = 0; i < n; i++) {
            projects[i][0] = capital[i];
            projects[i][1] = profits[i];
        }
        Arrays.sort(projects, (a, b) -> Integer.compare(a[0], b[0])); // sort by capital
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> Integer.compare(b, a)); // max heap of profits
        int i = 0;
        while (k > 0) {
            while (i < n && projects[i][0] <= w) {
                pq.offer(projects[i][1]);
                i++;
            }
            if (pq.isEmpty()) break; // no more projects available
            w += pq.poll();
            k--;
        }
        return w;
    }
}
