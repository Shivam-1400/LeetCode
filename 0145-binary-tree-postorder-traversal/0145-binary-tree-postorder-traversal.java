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
    List<Integer> ans;
    public List<Integer> postorderTraversal(TreeNode root) {
        ans= new ArrayList<>();
        postOrder(root);
        return ans;
    }
    void postOrder(TreeNode root){
        if(root != null)
        {
            postOrder(root.left);
            postOrder(root.right);
            ans.add(root.val);

        }
    }
}