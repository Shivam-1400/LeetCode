class Solution {
    public int maxDistance(int[][] grid) {
        int n= grid.length;
        List<List<Integer>> points= new ArrayList<>();
        for(int i=0; i< n; i++){
            for(int j=0; j< n; j++){
                System.out.print(grid[i][j]+" ");
                if(grid[i][j]== 1){
                    List<Integer> am= new ArrayList<>();
                    am.add(i);
                    am.add(j);
                    points.add(am);
                }
            }System.out.println();
        }
        System.out.println("\n"+points);
        if(points.size()==0 || points.size()== n*n){
            return -1;
        }
        int ans= getDistance(grid, points);
        
        for(int i=0; i< n; i++){
            for(int j=0; j< n; j++){
                System.out.print(grid[i][j]+" ");
            }System.out.println();
        }
        return ans;
        // int ans=0; 
        // for(int i=0; i< n; i++){
        //     for(int j=0; j<n; j++){
        //         if(grid[i][j]== 0){
        //             ans= Math.max(ans, dp[i][j]);
        //         }
        //     }
        // }
        // if(ans== Integer.MAX_VALUE || ans== 0){
        //     return -1;
        // }
        // return ans;
        
    }
    int getDistance(int[][] gr, List<List<Integer>> ls){
        int n= gr.length;
        LinkedList<int[]> qe= new LinkedList<>();
        for(int i= 0; i< ls.size(); i++){
            int[] ar= {ls.get(i).get(0), ls.get(i).get(1)};
            qe.addLast(ar);
            // gr[px][py]= -1;
        }
        int count=-1;
        
        int[] newX= {1, 0, -1, 0};
        int[] newY= {0, 1, 0, -1};
        
        while(qe.size() != 0){
            int sz= qe.size();
            count++;
            
            for(int i=0; i< sz; i++){
                int[] pos= qe.removeFirst();
                int px= pos[0];
                int py= pos[1];
                
                for(int k=0; k< 4; k++){
                    int nx= px+ newX[k];
                    int ny= py+ newY[k];
                    
                    if(nx>=0 && nx< n && ny>=0 && ny< n && gr[nx][ny]== 0){
                        int[] pr= {nx, ny};
                        qe.addLast(pr);
                        gr[nx][ny]= -1;
                    }
                }
            }          
        }
        return count;
    }
}