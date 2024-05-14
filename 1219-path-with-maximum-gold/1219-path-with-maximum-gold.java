class Solution {
    public int getMaximumGold(int[][] grid) {
        int maxGold = 0;
        int rows = grid.length;
        int cols = grid[0].length;
        
        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < cols; ++j) {
                if (grid[i][j] > 0) {
                    boolean[][] visited = new boolean[rows][cols];
                    int gold = findMaxGold(grid, i, j, rows, cols, visited);
                    maxGold = Math.max(maxGold, gold);
                }
            }
        }
        return maxGold;
    }

    private int findMaxGold(int[][] grid, int i, int j, int rows, int cols, boolean[][] visited) {
        if (i < 0 || j < 0 || i >= rows || j >= cols || grid[i][j] == 0 || visited[i][j]) {
            return 0;
        }
        
        visited[i][j] = true;
        
        int left = findMaxGold(grid, i, j - 1, rows, cols, visited);
        int right = findMaxGold(grid, i, j + 1, rows, cols, visited);
        int up = findMaxGold(grid, i - 1, j, rows, cols, visited);
        int down = findMaxGold(grid, i + 1, j, rows, cols, visited);
        
        visited[i][j] = false;
        
        return grid[i][j] + Math.max(left, Math.max(right, Math.max(up, down)));
    }
}