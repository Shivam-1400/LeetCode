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
    public ListNode removeElements(ListNode head, int val) {
        if(head== null){
            return head;
        }
        // ListNode temp= head;
        // ListNode prv= temp;
        // ListNode ans= prv;
        // while(temp != null && temp.val !=val){
        //     if(temp.val== val){
        //         prv.next= temp.next;
        //     }
        //     else{
        //         prv.next= temp;
        //     }
        //     temp= temp.next;
        // }
        // return ans.next;

        ListNode temp= head;
        ListNode prv= new ListNode(0);
        ListNode ans= prv;
        while(temp != null){
            // if(temp.val == val){
            //     temp= temp.next;
            //     continue;
            // }
            if(temp.val != val){
                int a= temp.val;
                prv.next= new ListNode(a);
                // prv.next= temp;
                prv= prv.next;
                // temp= temp.next;
                // prv.next= null;
            }
            temp= temp.next;
            // prv= prv.next;
        }
        return ans.next;
    }
}