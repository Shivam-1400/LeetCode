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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth==1){
            TreeNode addVal = new TreeNode(val);
            addVal.left=root;
            return addVal;
        }

        TreeNode left = addRow(root.left, val, depth-1, true);
        TreeNode right = addRow(root.right, val, depth-1, false);
        root.left=left;
        root.right=right;
        return root;
        
    }

    public TreeNode addRow(TreeNode root, int val, int depth, boolean isLeft){
        if(root==null){
            return depth==1?new TreeNode(val):null; //If depth is at leaf node
        }

        if(depth==1){
            //If depth is matched
             TreeNode addVal = new TreeNode(val);
             if(isLeft){
                addVal.left = root;
             } else{
                addVal.right=root;
             }
             return addVal;
        }

        TreeNode left = addRow(root.left, val, depth-1, true);
        TreeNode right = addRow(root.right, val, depth-1, false);
        root.left=left;
        root.right=right;
        return root;
    } 
}