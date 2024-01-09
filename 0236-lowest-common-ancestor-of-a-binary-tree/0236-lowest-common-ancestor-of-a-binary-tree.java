/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return solve(root, p.val, q.val);
        
    }
    TreeNode solve(TreeNode rt, int p, int q){
        if(rt== null){
            return null;
        }
        
        if(rt.val== p){
            return rt;
        }
        if(rt.val== q){
            return rt;
        }
        TreeNode lft= solve(rt.left, p, q);
        TreeNode rgt= solve(rt.right, p, q);
        
        if(lft!= null && rgt != null){
            return rt;
        }
        if(lft != null){
            return lft;
        }
        return rgt;
    }
}

// class Solution {
//     public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//         List<TreeNode> ls1= new ArrayList<>();
//         getPath(root, p.val, ls1);
        
//         List<TreeNode> ls2= new ArrayList<>();
//         getPath(root, q.val, ls2);
        
//         ls1.retainAll(ls2);
//         return ls1.get(ls1.size()-1);
        
//     }   
//     int getPath(TreeNode rt, int tr, List<TreeNode> ls){
//         if(rt== null){
//             return -1;
//         }
        
//         if(rt.val== tr){
//             ls.add(rt);
//             return 1;
//         }
        
//         int a=  getPath(rt.left, tr, ls);
//         if(a==1){
//             ls.addFirst(rt);
//             return 1;
//         }
//         int b=  getPath(rt.right,tr, ls);
//         if(b==1){
//             ls.addFirst(rt);
//             return 1;
//         }
//         return -1;
//     }
// }