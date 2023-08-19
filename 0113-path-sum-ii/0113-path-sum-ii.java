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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        // Integer sum= new Integer(0);
        int sum=0;
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> ax= new ArrayList<>();
        
        solve(root, ans, ax, sum, targetSum);
        return ans;
        
    }
    void solve(TreeNode root, List<List<Integer>> ans, List<Integer> ax, int sm, int target){
        if(root== null){
            return;
        }
        if(root.left == null && root.right == null){
            sm+= root.val;
            
            if(sm== target){
                ax.add(root.val);
                ans.add(new ArrayList<>(ax));
                ax.remove(ax.size()-1);
            }
            // sm-= root.val;
        }
        sm+= root.val;
        ax.add(root.val);
        solve(root.left, ans, ax, sm, target);
        solve(root.right, ans,ax, sm, target);
        
        // sm-= root.val;
        ax.remove(ax.size()-1);
        
    }
}