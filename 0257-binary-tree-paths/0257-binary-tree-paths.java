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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans= new ArrayList<>();
        
        String ax= new String("");
        solve(root, ax, ans);
        return ans;
        
    }
    void solve(TreeNode rt, String ax, List<String> ans){
        if(rt == null){
            return;
        }
        if(rt.left == null && rt.right== null){
            ax+= String.valueOf(rt.val);
            ans.add(ax);
            return;
        }
        ax+= rt.val;
        ax+="->";
        solve(rt.left, ax, ans);
        solve(rt.right, ax, ans);
        
        return;
        
    }
}