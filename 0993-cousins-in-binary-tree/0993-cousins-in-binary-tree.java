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
    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<TreeNode> qe= new LinkedList<>();
        
        qe.add(root);
        while(!qe.isEmpty()){
            int sz= qe.size();
            ArrayList<Integer> ax= new ArrayList<>();
            for(int i=0; i< sz; i++){
                TreeNode temp= qe.remove();
                ax.add(temp.val);
                if(temp.left != null && temp.right != null){
                    if((temp.right.val==x && temp.left.val==y) || (temp.right.val==y && temp.left.val== x))                     {
                        return false;
                    }
                }
                if(temp.right != null){
                    qe.add(temp.right);
                }
                if(temp.left != null){
                    qe.add(temp.left);
                }
            }
            if(ax.contains(x) && ax.contains(y)){
                return true;
            }
            ax.clear();
        }
        return false;
    }
}