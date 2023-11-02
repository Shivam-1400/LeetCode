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
class Pair{
    int a, b;
    Pair(){}
    Pair(int a, int b){
        this.a= a;
        this.b= b;
    }
}
class Solution {
    public int averageOfSubtree(TreeNode root) {
        Pair ans = new Pair();
        getSum(root, ans);
        return ans.b;
    }
    Pair getSum(TreeNode rt, Pair ansCnt){
        if(rt== null){
            return new Pair();
        }
        
        int sum= 0;
        int cnt= 0;
        cnt++;
        if(rt.left != null){
            Pair ls= getSum(rt.left, ansCnt);
            cnt+= ls.a;
            sum+= ls.b;
        }       
        if(rt.right != null){
            Pair rs= getSum(rt.right, ansCnt);
            cnt+= rs.a;
            sum+= rs.b;
        }
        
        
        int sm= sum+ rt.val;
               
        if(sm/(cnt) == rt.val){
            // System.out.println(rt.val);
            ansCnt.b= ansCnt.b+ 1;
        }
        
        return new Pair(cnt, sm);
    }
}