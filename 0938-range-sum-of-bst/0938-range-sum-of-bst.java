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
    public int rangeSumBST(TreeNode root, int low, int high) {
           int ans= inorder(root, 0, low, high);
        return ans;
    }
    int inorder(TreeNode root, int sum, int l, int h){
        if(root== null){
            return 0;
        }
        int s1= inorder(root.left, sum, l, h);
        int s2= inorder(root.right, sum, l, h);
        int x= root.val<=h && root.val>=l ? root.val: 0;
        return s1+s2+ x;
    }
}