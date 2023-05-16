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
// class Solution {
//     public ListNode swapPairs(ListNode head) {
//         if(head== null){
//             return head;
//         }
//         ListNode present= head;
//         ListNode cur= head;
//         ListNode nxt= head.next;
        
//         while(present != null  && present.next != null){
//             present= present.next.next;
            
//             cur.next= nxt.next;
//             nxt.next= cur;
            
//             // cur= cur.next;
//             // nxt= cur.next.next;
//         }
//         return head;
//     }
// }

class Solution{
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy;
        while (current.next != null && current.next.next != null) {
            ListNode first = current.next;
            ListNode second = current.next.next;
            first.next = second.next;
            current.next = second;
            current.next.next = first;
            current = current.next.next;
        }
        return dummy.next;
    }
}