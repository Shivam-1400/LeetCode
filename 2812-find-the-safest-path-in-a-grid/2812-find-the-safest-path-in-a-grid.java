class Pair<A,B>{
    A first;
    B second;
    public Pair(A first, B second){
        this.first = first;
        this.second = second;
    }
}
class Solution {
    int[][] directions = {{0,-1},{-1,0},{0,1},{1,0}};
    int n ;
    public int maximumSafenessFactor(List<List<Integer>> grid) {
        n = grid.size();
        //Multi-source BFS:
        int[][] distanceToNearestThief = new int[n][n];
        for(int i = 0; i < n ; i++){
            for(int j = 0 ; j < n ;j++){
                distanceToNearestThief[i][j] = Integer.MAX_VALUE;
            }
        }
        Queue<Pair<Integer,Integer>> q = new LinkedList<>();
        boolean[][] visited = new boolean[n][n];
        for(int i = 0; i < n ; i++){
            for(int j = 0 ; j < n ;j++){
                visited[i][j] = false;
            }
        }
        for(int i =0 ; i < n ;i++){
            for(int j = 0 ; j < n ; j++){
                if(grid.get(i).get(j) == 1){
                    q.offer(new Pair<>(i,j));
                    visited[i][j] = true;
                    distanceToNearestThief[i][j] = 0;
                }
            }
        }
        int level = 1;
        while(!q.isEmpty()){
            int qSize = q.size();
            while(qSize-->0){
                Pair<Integer,Integer> p = q.poll();
                int current_x = p.first;
                int current_y = p.second;
                for(int[] direction: directions){
                    int new_x = current_x + direction[0];
                    int new_y = current_y + direction[1];
                    if(new_x >=0  && new_x < n && new_y >= 0 && new_y < n && !visited[new_x][new_y] ){
                        q.offer(new Pair<>(new_x,new_y));
                        visited[new_x][new_y] = true;
                        distanceToNearestThief[new_x][new_y] = level;   
                    }

                }

            }
            level++;
        }
        // Binary Search to Find Safest Path : 
        int left = 0;
        int right = 400;
        int result = 0; 
        while(left < right){
            int mid = left + (right - left )/2;
            // BFS Check to find if path exists with SF >= mid
            if(bfsCheck(distanceToNearestThief,mid)){
                result = mid;
                left = mid+1;
            }
            else{
                right = mid ;
            }
        }
        return result;

    }

    public boolean bfsCheck(int[][] distanceToNearestThief,int mid){
        Queue<Pair<Integer,Integer>> q = new LinkedList<>();
        int nSize = distanceToNearestThief.length;
        boolean[][] visited = new boolean[n][n];
        for(int i = 0; i < n ; i++){
            for(int j = 0 ; j < n ;j++){
                visited[i][j] = false;
            }
        }
        q.offer(new Pair<>(0,0));
        visited[0][0] = true;
        if(distanceToNearestThief[0][0] < mid){
            return false;
        }
        while(!q.isEmpty()){
            Pair<Integer,Integer> p = q.poll();
            int curr_x = p.first;
            int curr_y = p.second;
            if(curr_x == n-1 && curr_y == n-1){
                return true;
            }
            for(int[] direction: directions){
                int new_x = curr_x + direction[0];
                int new_y = curr_y + direction[1];
                if(new_x >= 0 && new_x < n && new_y >= 0 && new_y < n && visited[new_x][new_y] == false &&  distanceToNearestThief[new_x][new_y] >= mid){
                    q.offer(new Pair<>(new_x,new_y));
                    visited[new_x][new_y] = true;
                }
                
            }

        }
        return false;
    }
}