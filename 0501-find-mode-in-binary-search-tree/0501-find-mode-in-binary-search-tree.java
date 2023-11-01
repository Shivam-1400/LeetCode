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
    Map<Integer, Integer> mp;
    void isValid(TreeNode root) {
        if (root == null) return;

        isValid(root.left);
        isValid(root.right);        
        
        mp.put(root.val, mp.getOrDefault(root.val, 0) + 1); 
    }
    public int[] findMode(TreeNode root) {
        mp = new HashMap<>();
        isValid(root); 
        
        int mxFrq = 0;
        
        for (int value : mp.values()) {
            mxFrq = Math.max(mxFrq, value);
        }

        List<Integer> res = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            if (entry.getValue() == mxFrq) {
                res.add(entry.getKey());
            }
        }
        int[] ans = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            ans[i] = res.get(i);
        }

        return ans;
    }
}