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
    ArrayList<Integer> inOrder(TreeNode root, ArrayList<Integer> x){
        if(root==null){
            return x;
        }
        inOrder(root.left, x);
        x.add(root.val);
        inOrder(root.right, x);
        
        return x;
    }
    public boolean findTarget(TreeNode root, int k) {
        
        ArrayList<Integer> inor= new ArrayList<>();
        inor= inOrder(root, inor);
        
        int i=0;
        int j= inor.size()-1;
        while(i<j){
            if(inor.get(i)+ inor.get(j)== k){
                return true;
            }
            
            if(inor.get(j) > k- inor.get(i)){
                j--;
            }else{
                i++;
            }
        }
        return false;
        
    }
}