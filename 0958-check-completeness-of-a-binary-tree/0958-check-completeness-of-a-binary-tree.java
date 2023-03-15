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
    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode> qu= new LinkedList<>();
        boolean flag = false;
        qu.add(root);
        while(!qu.isEmpty()){
            TreeNode temp_node = qu.remove();
             
            /* Check if left child is present*/
            if(temp_node.left != null)
            {
                 // If we have seen a non full node, and we see a node
                 // with non-empty left child, then the given tree is not
                 // a complete Binary Tree
                if(flag == true)
                    return false;
                 
                 // Enqueue Left Child
                qu.add(temp_node.left);
            }
            // If this a non-full node, set the flag as true
            else
                flag = true;
             
            /* Check if right child is present*/
            if(temp_node.right != null)
            {
                // If we have seen a non full node, and we see a node
                // with non-empty right child, then the given tree is not
                // a complete Binary Tree
                if(flag == true)
                    return false;
                 
                // Enqueue Right Child
                qu.add(temp_node.right);
                 
            }
            // If this a non-full node, set the flag as true
            else
                flag = true;
        }
         // If we reach here, then the tree is complete Binary Tree
        return true;
    }
}