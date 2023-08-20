class Solution {
    public int orangesRotting(int[][] grid) {
        int time= 0;
        int m= grid.length;
        int n= grid[0].length;
        
        int count1=0, count2=0;
        for(int i=0; i< m; i++){
            for(int j=0; j< n; j++){
                if(grid[i][j]==2){
                    count2++;
                }
                if(grid[i][j]==1){
                    count1++;
                }
            }
        }
        if(count2==0 && count1==0){
            return 0;
        }
        
        int tx= bfs(m, n, grid);
        for(int i=0; i< m; i++){
            for(int j=0; j< n; j++){
                if(grid[i][j]==1){
                    return -1;
                }
            }
        }
        return tx;
        
    }
    int bfs(int m, int n, int [][] grid){
        int time= 0;
        Queue<List<Integer>> qe= new LinkedList<>();
        
        for(int i=0; i< m; i++){
            for(int j=0; j< n; j++){
                if(grid[i][j]==2){
                    qe.add(List.of(i, j));
                }
            }
        }
        
        int nx[]={1, 0, -1, 0};
        int ny[]={0, -1, 0, 1};
        
        while(!qe.isEmpty()){
            time++;
            int sz= qe.size();
            
            for(int i=0; i< sz; i++){
                List<Integer> ax= qe.remove();
                int px= ax.get(0);
                int py= ax.get(1);
                
                for(int k=0; k<4; k++){
                    int newX= px+ nx[k];
                    int newY= py+ ny[k];
                    if(isValid(newX, newY, m, n, grid)){
                        qe.add(List.of(newX, newY));
                        grid[newX][newY]=2;
                    }
                }
            }
        }
        return time-1;
    }
    boolean isValid(int x, int y, int m, int n, int[][] gr){
        if(x>=0 && x<m && y>=0 && y<n){
            if(gr[x][y]==1){
                return true;
            }
        }
        return false;
    }
}