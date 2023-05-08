class Solution {
    public int diagonalSum(int[][] mat) {
        int sm=0;
        int n= mat.length;
        for(int i=0; i<n; i++){
            for(int j=0; j< n; j++){
                if(i==j || (i+1)+(j+1)==n+1){
                    sm= sm+ mat[i][j];
                }
            }
        }
        // if(n%2==1){
        //     sm= sm- mat[n/2][n/2];
        // }
        return sm;
    }
}