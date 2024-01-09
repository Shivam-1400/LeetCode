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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        
        
        List<Integer> ax1= getList(root1, new ArrayList<>());
        List<Integer> ax2= getList(root2, new ArrayList<>());
        
        
        System.out.println(ax1);
        System.out.println(ax2);
        return ax1.equals(ax2);
        
    }
    List<Integer> getList(TreeNode rt, List<Integer> ax){
        if(rt== null){
            return ax;
        }
        ax= getList(rt.left, ax);
        if(rt.left== null && rt.right== null){
            ax.addLast(rt.val);
        }
        ax= getList(rt.right, ax);
        
        return ax;
    }
}