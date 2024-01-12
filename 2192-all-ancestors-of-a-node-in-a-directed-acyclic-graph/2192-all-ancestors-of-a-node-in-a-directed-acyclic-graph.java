class Solution {
//     public List<List<Integer>> getAncestors(int n, int[][] edges) {
//         Arrays.sort(edges, Comparator.comparingInt(a -> a[0]));
//         List<Set<Integer>> ans= new ArrayList<>();
        
//         for(int i=0; i<n; i++){
//             ans.add(new HashSet<>());
//         }
        
//         int e= edges.length;
//         for(int i=0; i< e; i++){
//             int st= edges[i][0];
//             int ed= edges[i][1];
//             if(ans.get(st).size()!= 0){
//                 ans.get(ed).addAll(ans.get(st));
//             }
//             ans.get(ed).add(st);
//         }
//         for(int i=0; i< e; i++){
//             int st= edges[i][0];
//             int ed= edges[i][1];
//             if(ans.get(st).size()!= 0){
//                 ans.get(ed).addAll(ans.get(st));
//             }
//             ans.get(ed).add(st);
//         }
//         for(int i=0; i< e; i++){
//             int st= edges[i][0];
//             int ed= edges[i][1];
//             if(ans.get(st).size()!= 0){
//                 ans.get(ed).addAll(ans.get(st));
//             }
//             ans.get(ed).add(st);
//         }
//         System.out.println(ans);
//         List<List<Integer>> ans2= new ArrayList<>();
//         for (Set<Integer> set : ans) {
//             List<Integer> list = new ArrayList<>(set);
//             ans2.add(list);
//         }
//         return ans2;
//     }
    
    public List<List<Integer>> getAncestors(int n, int[][] edges) {
        int[] inDegree = new int[n];
        Map<Integer, List<Integer>> parentToKids = new HashMap<>();
        for (int[] e : edges) {
            parentToKids.computeIfAbsent(e[0], l -> new ArrayList<>()).add(e[1]);
            ++inDegree[e[1]];
        }
        
        List<Set<Integer>> sets = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; ++i) {
            sets.add(new HashSet<>());
            if (inDegree[i] == 0)
                q.offer(i);
        }
        
        while (!q.isEmpty()) {
            int parent = q.poll();
            for (int kid : parentToKids.getOrDefault(parent, Arrays.asList())) {
                sets.get(kid).add(parent);
                sets.get(kid).addAll(sets.get(parent));
                if (--inDegree[kid] == 0)
                    q.offer(kid);
            }
        }
         
        List<List<Integer>> ans = new ArrayList<>();
        for (Set<Integer> set : sets)
            ans.add(new ArrayList<>(new TreeSet<>(set)));
        return ans;
    }
}