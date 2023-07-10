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
    public int minDepth(TreeNode root) {
        if(root== null){
            return 0;
        }
        Queue<TreeNode> qe= new LinkedList<>();

        int ans=1;
        qe.add(root);
        while(qe.isEmpty() != true){
            int sz= qe.size();
            for(int i=0; i< sz; i++){
                TreeNode temp= qe.remove();
                if(temp == null){
                    continue;
                }
                if(temp.right == null && temp.left== null){
                    return ans;
                }

                qe.add(temp.left);
                qe.add(temp.right);
            }
            ans++;
        }
        return ans;
    }
}