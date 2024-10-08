class Solution {
    public int[][] findFarmland(int[][] land) {
        if (land == null || land.length == 0) {
            return new int[0][0];
        }
        List<int[]> result = new ArrayList<>();
        for (int i = 0; i < land.length; i++) {
            for (int j = 0; j < land[0].length; j++) {
                if (land[i][j] == 1) {
                    int[] pair = dfs(land, i, j);
                    result.add(pair);
                }
            }
        }
        return result.toArray(new int[result.size()][]);
    }

    public int[] dfs(int[][] land, int i, int j) {
        int[] arr = new int[4];
        arr[0] = i;
        arr[1] = j;

        int row = i;
        int col = j;

         while (row < land.length && land[row][j] == 1) {
            row++ ;
        }
        while (col < land[0].length && land[i][col] == 1) {
            col++ ;
        }

        arr[2] = row - 1;
        arr[3] = col - 1;

        for (int k = i; k < row; k++) {
            for (int p = j; p < col; p++) {
                
                    land[k][p] = 0;
   
            }
        }
        return arr;
    }
}