class Solution {
    boolean checkRow(int[][] mat, int x, int y){
       for(int j=0;j < mat[0].length;j++){
            if(y == j) continue;
            if(mat[x][j] == 1 ){
                return false;
            }
        }
        return true;
    }
    boolean checkCol(int[][] mat, int x, int y){
        for(int j=0;j < mat.length;j++){
            if(x == j) continue;
            if(mat[j][y] == 1 ){
                return false;
            }
        }
        return true;
    }
    public int numSpecial(int[][] mat) {
        List<Integer> ax= new ArrayList<>();
        int n= mat.length;
        int m= mat[0].length;
        int ans= 0;
        for(int i=0; i< n; i++){
            for(int j=0; j< m; j++){
                if(mat[i][j] == 1){
                    if(checkRow(mat, i, j) && checkCol(mat, i, j)){
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
}