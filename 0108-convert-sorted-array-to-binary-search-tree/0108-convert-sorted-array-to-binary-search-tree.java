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
    public TreeNode solve(int[] nums, TreeNode rt, int st, int ed){
        if(st>=ed){
            return null;
        }
        int mid= (st+ed)/2;
        
        rt= new TreeNode(nums[mid]);
        rt.left= solve(nums, rt.left, st, mid);
        rt.right= solve(nums, rt.right, mid+1, ed);
        return rt;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        int n= nums.length;
        int st=0;
        int ed= n;
        TreeNode rt= new TreeNode(0);
        return solve(nums, rt, st, ed);
    }
}