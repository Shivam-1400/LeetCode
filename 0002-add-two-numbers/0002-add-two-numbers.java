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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans= new ListNode(0);
        ListNode temp3= ans;
        // ListNode temp1= l1;
        // ListNode temp2= l2;
        int carry=0;
        while(l1 != null || l2 != null || carry !=0){
            int a= (l1 != null)? l1.val: 0;
            int b= (l2 != null)? l2.val: 0;
            l1= (l1 != null)? l1.next: null;
            l2= (l2 != null)? l2.next: null;
            // if(l1 != null){
            //     l1= l1.next;
            // }
            // if(l2 != null){
            //     l2= l2.next;
            // }
            int x= carry+a+b;
            carry= x/10;
            temp3.next= new ListNode(x%10);
            temp3= temp3.next;
        }
        return ans.next;
    }
}