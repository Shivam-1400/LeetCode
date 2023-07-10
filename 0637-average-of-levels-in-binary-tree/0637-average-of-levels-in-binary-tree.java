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
    public List<Double> averageOfLevels(TreeNode root) {
//         if(root == null){
            
//         }
        Queue<TreeNode> qe= new LinkedList<>();
        List<Double> ans= new ArrayList<>();
        qe.add(root);
        while(!qe.isEmpty()){
            int sz=qe.size();
            double sm=0;
            for(int i=0; i< sz; i++){
                TreeNode temp= qe.remove();
                sm= sm+ temp.val;
                if(temp.left != null){
                    qe.add(temp.left);
                }
                if(temp.right != null){
                    qe.add(temp.right);
                }
            }
            ans.add(sm/sz);
        }
        return ans;
    }
}