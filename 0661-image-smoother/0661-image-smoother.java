class Solution {
    int solve(int[][] img, int x, int y){
        int m= img.length;
        int n= img[0].length;
        
        int Nx[] = {-1,1,0,0,-1, 1, -1, 1};
        int Ny[] = {0,0,-1,1, 1, 1, -1, -1};
        int sm= img[x][y];
        int count=1;
        for(int i=0; i< 8; i++){
            int nx= x+ Nx[i];
            int ny= y+ Ny[i];
            if(nx<m && nx>=0 && ny<n && ny>=0){
                sm+= img[nx][ny];
                count++;
            }
        }
        return (sm/count);
    }
    public int[][] imageSmoother(int[][] img) {
        int m= img.length;
        int n= img[0].length;
        int[][] ans= new int[m][n];
        
        for(int i=0; i< m; i++){
            for(int j=0; j< n; j++){
               int a= solve(img, i, j);
                ans[i][j]= a;
            }
        }
        return ans;
    }
}