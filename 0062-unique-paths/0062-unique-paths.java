class Solution {
    public int uniquePaths(int m, int n) {
        int ax[]= new int[n];
        for(int i=0; i< n; i++){
            ax[i]= 1;
        }
        
        for(int ii=1; ii< m; ii++){
            for(int i=1; i< n; i++){
                int prev=0;
                // if(i-1>=0){
                    prev= ax[i-1];
                // }
                ax[i]= ax[i]+ prev;
            }
            show(ax);
        }
        return ax[n-1];
    }
    void show(int[] a){
        for(int i=0; i< a.length; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    
    // public int uniquePaths(int m, int n) {
    //     int[][] dp  = new int[m][n];
    //     if(m==1 || n==1){
    //         return 1;
    //     }
    //     // if(isValid(1,0, m, n)){
    //         dp[1][0]= 1;
    //     // }
    //     // if(isValid(0, 1, m, n)){
    //         dp[0][1]= 1;
    //     // }
    //     // int nx[]= {1, 0};
    //     // int ny[]= {0, 1};
    //     for(int i=0; i< m; i++){
    //         for(int j =0; j< n; j++){
    //             if(i==1 && j==0 || i==0 && j==1){
    //                 continue;
    //             }
    //                 int pr1= 0;
    //                 int pr2= 0;
    //                 if(isValid(i-1, j, m, n)){
    //                     pr1= dp[i-1][j];
    //                 }
    //                 if(isValid(i, j-1, m, n)){
    //                     pr2= dp[i][j-1];
    //                 }
    //                 dp[i][j]= pr1+ pr2;
    //         }
    //     }
    //     return dp[m-1][n-1];
    // }
    // boolean  isValid(int x, int y, int m, int n){
    //     if(x>=0 && x< m && y>=0 && y< n){
    //         return true;
    //     }
    //     return false;
    // }
}