/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public TreeNode solve(List<Integer> a, TreeNode rt, int st, int end){
        if(st>= end){
            return null;
        }
        int mid= (st+end)/2;
        rt= new TreeNode(a.get(mid));
        rt.left= solve(a, rt.left, st, mid);
        rt.right= solve(a, rt.right, mid+1, end);
        return rt;
    }
    
    public TreeNode sortedListToBST(ListNode head) {
        List<Integer> a= new ArrayList<Integer>();
        
        ListNode temp= head;
        while(head != null){
            a.add(head.val);
            head= head.next;
        }
        for(var i: a){
            System.out.println(i);
        }
        int n= a.size();
        TreeNode ans= new TreeNode();
        ans= solve(a, ans, 0, n);
        return ans;
        
    }
}