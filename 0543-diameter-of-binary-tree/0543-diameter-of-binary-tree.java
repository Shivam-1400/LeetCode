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
    public int diameterOfBinaryTree(TreeNode root) {
        counter(root);
        return diameter;
    }
    int diameter = 0;
    public int counter(TreeNode rt) {
        if(rt == null) return 0;
        int l = counter(rt.left);
        int r = counter(rt.right);
        diameter = Math.max(l+r,diameter);
        return Math.max(l+1, r+1);
    }
}