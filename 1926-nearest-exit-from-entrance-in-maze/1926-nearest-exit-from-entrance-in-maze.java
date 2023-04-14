// class Solution {
//     public int nearestExit(char[][] maze, int[] entrance) {
//         int m= maze.length;
//         int n= maze[0].length;

//         int xe= entrance[0];
//         int ye= entrance[1];

//         int ans= m*n;
//         int count=0;
//         for(int i=0; i< m; i++){
//             for(int j=0; j< n; j++){
//                 if((i*j==0 || i==m-1 || j== n-1) && i != xe && j !=ye && maze[i][j] =='.'){
//                        count= dfs(maze, m, n, i, j, xe, ye, count );
//                        if(count != 0){
//                            ans= Math.min(ans, count);
//                        } 
//                 }
//             }
//         }
//         if(ans==0){
//             return -1;
//         }
//         return ans;
//     }
//     int dfs(char[][] maze, int m, int n, int x, int y, int xe, int ye, int count){
//         int ans=0;
//         if(x== xe && y== ye){
//             ans= count;
//             return ans;
//         }
//         maze[x][y]= '+';

//         int rx[]= {1, 0, -1, 0};
//         int cy[]= {0, -1, 0, 1};

//         for(int i=0; i< 4; i++){
//             int nx= x+ rx[i];
//             int ny= y+ cy[i];

//             if(nx>=0 && ny>=0 && nx< m && ny< n && maze[nx][ny]=='.'){
//                 count = dfs(maze, m, n, nx, ny, xe, ye, count+1);
//             }
//         }
//         return ans;
//     }
// }

// class Solution {
//     public int nearestExit(char[][] maze, int[] entrance) {
        

        
//     }
//     dfs( char[][] maze, int m, int n, int x, int y, int ex, int ey, int cout){
//         maze
//         int rx[]= {1, 0, -1, 0};
//         int cy[]= {0, -1, 0, 1};

//         for(int i=0;i< 4, i++){
//             int nx= x+ rx[i];
//             int ny= y+ cy[i];

//             if(nx>=0 && nx< m && ny>=0 && ny< n && maze[nx][ny]=='.'){
//                 count= dfs(maze, m, n, nx, ny, count+1);
//             }
//         }
//         return count;
//     }
// }


class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
        int m= maze.length;
        int n= maze[0].length;

        ArrayList<Integer> ax= new ArrayList<>();
        Queue<ArrayList<Integer>> qe= new LinkedList<ArrayList<Integer>>();

        // int d=0;
        maze[entrance[0]][entrance[1]]= '*';
        ax.add(entrance[0]);
        ax.add(entrance[1]);
        ax.add(0);
        qe.add(new ArrayList(ax));
        while(!qe.isEmpty()){
            ax= qe.remove();
            int x= ax.remove(0);
            int y= ax.remove(0);
            int d= ax.remove(0);
            System.out.println(x+" "+y+" "+ d+" removed");
            

            if(x==0 || x==m-1 || y==0 || y==n-1){
                if(x != entrance[0] || y!= entrance[1])
                    return d;
            }

            int rx[]= {1, 0, -1, 0};
            int cy[]= {0, 1, 0, -1};

            for(int i=0; i< 4; i++){
                int nx= x+ rx[i];
                int ny= y+ cy[i];
                

                if(nx>=0 && nx< m && ny>=0 && ny<n && maze[nx][ny]=='.'){
                    System.out.println("new x and Y : "+ nx+" "+ ny+" added into queue");
                    maze[nx][ny]= '*';
                    ax.add(nx);
                    ax.add(ny);
                    ax.add(d+1);
                    qe.add(new ArrayList(ax));
                    ax.remove(0);
                    ax.remove(0);
                    ax.remove(0);
                }
            }
        }

        return -1;
        
    }
    
}





















