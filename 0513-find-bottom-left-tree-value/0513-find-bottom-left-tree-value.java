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
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> qe= new LinkedList<>();
        int ans= root.val;
        qe.add(root);
        while(!qe.isEmpty()){
            int sz= qe.size();
            for(int i=0; i< sz; i++){
                TreeNode temp= qe.remove();
                if(i==0){
                    ans= temp.val;
                }
                if(temp.left != null){
                    qe.add(temp.left);
                }
                if(temp.right != null){
                    qe.add(temp.right);
                }
            }
        }
        return ans;
    }
}