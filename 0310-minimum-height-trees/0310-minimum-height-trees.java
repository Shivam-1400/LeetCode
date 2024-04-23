class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        List<Integer> res = new ArrayList<>();
        if(n == 1 ){
            res.add(0);
            return res;
        }
        if(n == 2){
            res.add(edges[0][0]);
            res.add(edges[0][1]);
            return res;
        }
        Queue<Integer> q = new LinkedList<>();
        List<List<Integer>> adj = new ArrayList<>();
        int[] neighbours = new int[n];
        for(int i = 0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] arr: edges){
            neighbours[arr[0]]++;
            neighbours[arr[1]]++;
            adj.get(arr[0]).add(arr[1]);
            adj.get(arr[1]).add(arr[0]);
        }
        for(int i = 0;i<n;i++){
            if(neighbours[i] == 1){
                q.add(i);
            }
        }

        while(n>2){
            int size = q.size();
            n-=size;
            while(size-->0){
                int temp = q.poll();
                for(int item : adj.get(temp)){
                    neighbours[item]--;
                    if(neighbours[item] == 1){
                        q.add(item);
                    }
                }
            }
        }
        
        res.addAll(q);
        return res;
    }
}