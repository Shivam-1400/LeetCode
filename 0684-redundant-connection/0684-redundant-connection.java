class Solution {
    int[] parent;
    // int[] height;
        
    public int[] findRedundantConnection(int[][] edges) {
        int n= edges.length;
        parent= new int[n+1];
        
        for(int i=0; i< n+1; i++){
            parent[i]= i;
        }
        for(int i=0;i< n; i++){
            int st= edges[i][0];
            int ed= edges[i][1];
            if(merge(st, ed)== false){
                return new int[]{st, ed};
            }
        }
        return new int[]{0, 0};
        
    }
    boolean merge(int x, int y){
        int p1= findParent(x);
        int p2= findParent(y);
        
        if(p1== p2){
            return false;
        }
        parent[p1]= p2;
        return true;
    }
    int findParent(int x){
        if(parent[x]== x){
            return x;
        }
        return findParent(parent[x]);
    }
    
}



// class Solution {
//     int[] parent;
//     int[] height;
        
//     public int[] findRedundantConnection(int[][] edges) {
//         int n= edges.length;
//         parent= new int[n+1];
//         height= new int[n+1];
//         for(int i=0; i<n+1; i++){
//             parent[i]= i;
//             height[i]= 1;
//         }
        
//         List<List<Integer>> ls= new ArrayList<>();
//         for(int i=0; i<=n; i++){
//             ls.add(new ArrayList<>());
//         }
        
        
//         int s= edges[0][0]-1;
//         int e= edges[0][1]-1;
//         for(int i=1; i< n; i++){
//             s= edges[i][0];
//             e= edges[i][1];
//             ls.get(s).add(e);
//             ls.get(e).add(s);
            
//             if(!merge(s, e)){
//                     return new int[]{s,e};
//                 }
//         }
        
//         // System.out.println(ls);
        
        
        
// //         for(int i=0; i<n; i++){
// //             for(int j=0; j< ls.get(i).size(); j++){
// //                 if(!merge(i, ls.get(i).get(j))){
// //                     return new int[]{i,ls.get(i).get(j) };
// //                 }
// //                 System.out.print(i+" "+ls.get(i).get(j)+"---->>>>");
                
// //                 for(int x: height){
// //                     System.out.print(x+" ");
// //                 }
// //                 System.out.print("---->>>");
// //                 for(int x: parent){
// //                     System.out.print(x+" ");
// //                 }
// //                 System.out.println();
// //             }
// //         }
        
//         for(int x: height){
//             System.out.print(x+" ");
//         }
//         System.out.println();
        
//         // return parent;
//         return new int[]{s,e};
//     }
//     int findParent(int x){
//         if(parent[x]== x){
//             return x;
//         }
//         parent[x]= findParent(parent[x]);
//         return parent[x];
//     }
//     boolean merge(int x, int y){
//         int p1= findParent(x);
//         int p2= findParent(y);
        
//         if(p1==p2){
//             return false;
//         }
//         // parent[p2]= p1;  
        
//         // if (height[x] > height[y]) { // Union by larger size
//         //     height[x] += height[y];
//         //     parent[y] = x;
//         // } else {
//         //     height[y] += height[x];
//         //     parent[x] = y;
//         // }
//         // return true;
        
        
//         if(height[x] > height[y]){
//             parent[y]= x;
//         }
//         else if(height[x]< height[y]){
//             parent[x]= y;
//         }
//         else{
//             parent[x]= y;
//             height[y]++;
//         }
//         return true;
        
//     }
// }