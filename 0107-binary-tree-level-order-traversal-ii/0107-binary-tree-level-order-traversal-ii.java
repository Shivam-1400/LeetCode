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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if(root== null){
            return new ArrayList<>();
        }
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> ax= new ArrayList<>();
        Queue<TreeNode> qe= new LinkedList<>();
        qe.add(root);
        while( !qe.isEmpty()){
            int sz= qe.size();
            
            for(int i=0; i< sz; i++){
                TreeNode temp= qe.remove();
                
                if(temp.left != null){
                    qe.add(temp.left);
                }
                if(temp.right != null){
                    qe.add(temp.right);
                }
                ax.add(temp.val);
            }
            
            ans.add(0 , new ArrayList<>(ax));
            ax.clear();
        }
        return ans;
        
        
    }
}