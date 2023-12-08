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
    String preorder(TreeNode x, String a){
        if(x.left== null && x.right==null){
            return x.val+"";
        }
        String ans= x.val+"(";
        if(x.left != null){
            ans= ans+ preorder(x.left, ans);
        }
        ans+=")";
        if(x.right != null){
            ans= ans+"("+ preorder(x.right, ans)+")";
        }
        return ans;
            
    }
    public String tree2str(TreeNode root) {
        String ans="";
        
        return preorder(root, ans);
        
    }
}