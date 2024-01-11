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
    public int maxAncestorDiff(TreeNode root) {
        Queue<TreeNode> qe= new LinkedList<>();
        qe.add(root);
        int ans= 0;
        while(qe.size()> 0){
            int n= qe.size();
            for(int i=0; i< n; i++){
                TreeNode t= qe.remove();
                ans= Math.max(ans, solve(t));
                
                if(t.left != null){
                    qe.add(t.left);
                }
                if(t.right!= null){
                    qe.add(t.right);
                }
            }
        }
        return ans;
    }
    
    int solve(TreeNode rt){
        Queue<TreeNode> q= new LinkedList<>();
        q.add(rt);
        int x= rt.val;
        int mdif= 0;
        // int l=0;
        while(q.size() != 0 ){
            int n= q.size();
            
            for(int i=0; i< n; i++){
                TreeNode temp= q.remove();
                if(temp.left != null){
                    q.add(temp.left);
                }
                if(temp.right != null){
                    q.add(temp.right);
                }
                mdif= Math.max(mdif, Math.abs(x- temp.val));
            }
            // l++;
        }
        return mdif;
    }
}