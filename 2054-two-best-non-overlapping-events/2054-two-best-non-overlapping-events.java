class Solution {
    public int findNext(int[][] events, int check) {
        int l = 0, h = events.length - 1, res = -1;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (events[mid][0] > check) {
                res = mid;
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return res;
    }

    public int solve(int[][] events, int i, int count, int n, int[][] memo) {
        if (count == 2 || i >= n) {
            return 0;
        }
        if (memo[i][count] != -1) {
            return memo[i][count];
        }
        int nextValid = findNext(events, events[i][1]);
       int take = events[i][2];
        if (nextValid != -1) {
            take += solve(events, nextValid, count + 1, n, memo);
        }
        int notTake = solve(events, i + 1, count, n, memo);

        return memo[i][count] = Math.max(take, notTake);
    }

    public int maxTwoEvents(int[][] events) {
        Arrays.sort(events, (a, b) -> Integer.compare(a[0], b[0]));
        int n = events.length;
        int[][] memo = new int[n][3]; 
        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }
        return solve(events, 0, 0, n, memo);
    }
}