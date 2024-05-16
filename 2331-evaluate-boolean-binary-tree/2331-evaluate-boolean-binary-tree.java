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
    public boolean evaluateTree(TreeNode root) {
        if(root.left== null && root.right== null){
            return 1== root.val;
        }
        boolean left= evaluateTree(root.left);
        boolean right= evaluateTree(root.right);
        boolean ans= false;
        if(root.val == 2){
            ans= left || right;
        }
        else if(root.val == 3){
            ans= left && right;
        }
        return ans;
        
         
    }
}