class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        Queue<myData> q= new LinkedList<>();
        int x=0;
        int y=0;
        int d=1;
        int n= grid.length;
        if(grid[0][0] != 0){
            return -1;
        }
        int rx[]= {1, 1, 1, 0, -1, -1, -1, 0};
        int cy[]= {1, 0, -1, -1, -1, 0, 1, 1};

        q.add(new myData(d, x, y));
        grid[0][0]= -1;
    
        while(!q.isEmpty()){
            myData obj= q.remove();
            x= obj.x;
            y= obj.y;
            d= obj.dist;
            // System.out.println(x+" "+y+" "+d);

            if(x== n-1 && y== n-1){
                return d;
            }

            for(int i=0; i< 8; i++){
                int nx= x+ rx[i];
                int ny= y+ cy[i];

                if(nx<n && ny< n && nx>=0 && ny>=0 && grid[nx][ny]==0){
                    q.add(new myData(d+1, nx, ny));
                    grid[nx][ny]= -1;
                }
            }
        }
        return -1;

    }
}
class myData{
      int dist;
      int x, y;
      myData(int a, int b, int c){
          dist= a;
          x= b;
          y= c;
      }
}