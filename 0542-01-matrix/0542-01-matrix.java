class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m= mat.length;
        int n= mat[0].length;
        
        Queue<List<Integer>> qe= new LinkedList<>();
        for(int i=0; i< m; i++){
            for(int j=0; j< n; j++){
                if(mat[i][j]==0){
                    qe.add(List.of(i, j));
                }
                else{
                    mat[i][j]= -1;
                }
            }
        }
        int l=0; 
        int nx[]={1, 0, -1, 0};
        int ny[]={0, 1, 0, -1};
        while(!qe.isEmpty()){
            int sz= qe.size();
            l++;
            
            for(int s=0; s< sz; s++){
                List<Integer> ax= qe.remove();
                int px= ax.get(0);
                int py= ax.get(1);
                
                for(int k=0; k<4; k++){
                    int newX= px+ nx[k];
                    int newY= py+ ny[k];
                    if(isValid(newX, newY, m, n, mat)){
                        qe.add(List.of(newX, newY));
                        if(mat[newX][newY] != 0){
                            mat[newX][newY]= l;
                        }
                    }
                }
            }
            
        }
        return mat;
    }
    boolean isValid(int x, int y, int m, int n, int [][]gr){
        if(x>=0 && x< m && y>=0 && y< n){
            if(gr[x][y] <0){
                return true;
            }
        }
        return false;
    }
    
//     public int[][] updateMatrix(int[][] mat) {
//         Queue<int[]> q = new LinkedList<>();
//         int rows = mat.length;
//         int cols = mat[0].length;
        
//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < cols; j++) {
//                 if (mat[i][j] == 0) {
//                     q.offer(new int[]{i, j});
//                 } else {
//                     mat[i][j] = -1;
//                 }
//             }
//         }
        
//         int[] dirX = {1, -1, 0, 0};
//         int[] dirY = {0, 0, 1, -1};
        
//         int length = 0;
//         while (!q.isEmpty()) {
//             int size = q.size();
//             length++;
//             while (size-- > 0) {
//                 int[] front = q.poll();
//                 int r = front[0];
//                 int c = front[1];
//                 for (int i = 0; i < 4; i++) {
//                     int newRow = r + dirX[i];
//                     int newCol = c + dirY[i];
//                     if (newRow < 0 || newCol < 0 || newRow >= rows || newCol >= cols || mat[newRow][newCol] >= 0) {
//                         continue;
//                     }
//                     mat[newRow][newCol] = length;
//                     q.offer(new int[]{newRow, newCol});
//                 }
//             }
//         }
        
//         return mat;
//     }
}