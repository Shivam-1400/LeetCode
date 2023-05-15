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
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        if(head== null || head.next== null){
            return head;
        }
        ListNode fwd= head;
        ListNode bkd= head;
        ListNode fast= head;
        
        int n=k;
        while(n>1 && fwd.next != null){
            fwd= fwd.next;
            fast =fast.next;
            n--;
        }
        
        while(fast.next!= null){
            fast= fast.next;
            bkd= bkd.next;
        }
        System.out.println(fwd.val+" "+ bkd.val+"-------");
        int x= fwd.val;
        fwd.val= bkd.val;
        bkd.val= x;
        
        return head;
    }
}