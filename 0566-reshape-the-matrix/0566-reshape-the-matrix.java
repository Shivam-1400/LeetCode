class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m= mat.length;
        int n= mat[0]. length;
        
        if(m*n != r*c){
            return mat;
        }
        
        int[][] ans= new int[r][c];
        int p=0, q=0;
        for(int i=0; i< r; i++){
            for(int j=0; j<c; j++){
                ans[i][j]= mat[p][q++];
                if(q==n){
                    p++;
                    q=0;
                }
            }
        }
        return ans;
    }
}