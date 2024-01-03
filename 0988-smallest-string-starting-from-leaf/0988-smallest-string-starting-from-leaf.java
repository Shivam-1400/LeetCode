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
    private String res;
    public String smallestFromLeaf(TreeNode root) {
        res = null;
        solve(root, "" + (char)(root.val + 'a'));
        return res;
    }

     void solve(TreeNode root, String path) {
        if (root.left == null && root.right == null) {
            if (res == null || path.compareTo(res) < 0) res = path;
            return;
        }

        if (root.left != null) {
            solve(root.left, (char)(root.left.val + 'a') + path);
        }

        if (root.right != null) {
            solve(root.right, (char)(root.right.val + 'a') + path);
        }
    }
}
