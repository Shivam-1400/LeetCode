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
        TreeNode ans= solve(root, p.val, q.val);
        return ans;
    }
    TreeNode solve(TreeNode rt, int p, int q){
        
        int v= rt.val;
        
        if(p< v && q<v && rt.left!= null){
            return solve(rt.left, p, q);
        }
        else if(p>v && q>v && rt.right!= null){
            return solve(rt.right, p, q);
        }
        return rt;
    }  
}