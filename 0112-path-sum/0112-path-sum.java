/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        boolean ans= solve(root, 0, targetSum);
        return ans;
    }
    boolean solve(TreeNode rt, int sm, int target){
        if(rt== null){
            return false;
        }
        if(rt.left == null && rt.right== null){
            sm+= rt.val;
            if(sm== target){
                return true;
            }
        }
        sm+= rt.val;
        return solve(rt.left, sm, target) || solve(rt.right, sm, target);
        
    }
}