class Solution {
    
    Integer dp[][][];
    
    public int cherryPickup(int[][] grid) {
        int n = grid.length;
        int cols = grid[0].length;
        dp = new Integer[n+1][cols+1][cols+1];
        return solve(grid, 0, 0, cols-1);
    }
    
    public int solve(int[][] grid, int currRow, int rbtA, int rbtB) {
        
        if(rbtA < 0 || rbtB < 0 || rbtA >= grid[0].length || rbtB >= grid[0].length) return 0;
        
        if(currRow == grid.length) return 0;
        
        if(dp[currRow][rbtA][rbtB] != null)
            return dp[currRow][rbtA][rbtB];
        
        int result = 0;
        result += grid[currRow][rbtA];
        result += grid[currRow][rbtB];
        
        int max = 0;
        for(int x=rbtA-1;x<=rbtA+1;x++) {
            for(int y=rbtB-1;y<=rbtB+1;y++) {
                if(x < y) { // they should not cross
                    max = Math.max(max, solve(grid, currRow+1, x, y));
                }
            }
        }
        
        result += max;
        return dp[currRow][rbtA][rbtB] = result;
    }
}