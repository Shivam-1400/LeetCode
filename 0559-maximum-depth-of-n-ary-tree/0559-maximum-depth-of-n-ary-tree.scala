/**
 * Definition for a Node.
 * class Node(var _value: Int) {
 *   var value: Int = _value
 *   var children: List[Node] = List()
 * }
 */

object Solution {
    def maxDepth(root: Node): Int = {
        if (root == null) 
            0
        
        else if (root.children.isEmpty) 
            1
        
        else
            root.children.map(child => maxDepth(child)).max+1
        
        
        
//         if (root == null)  0
//         if (root.children.isEmpty)  1
        
//         def getDepth(rt: Node): Int={
//             if(rt== null) 0
//             if(rt.children.isEmpty) 1
//             else root.children.map(c=>getDepth(c)).max + 1
            
//         }
//         getDepth(root)
    }
}

// class Solution {
//     public int maxDepth(Node root) {
//         int ans= getHeight(root);
//         return ans;
//     }
//     int getHeight(Node rt){
//         if(rt== null){
//             return 0;
//         }
//         int n= rt.children.size();
//         int mx= 0;
//         for(int i=0; i<n; i++){
//             mx= Math.max(mx, getHeight(rt.children.get(i)));
//         }
//         return mx+1;
//     }
// }