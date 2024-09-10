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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode temp= head;
        ListNode prv= temp;
        temp= temp.next;
        while(temp != null){
            int gcd= gcd(prv.val, temp.val);
            ListNode newN= new ListNode(gcd);
            prv.next= newN;
            newN.next= temp;
            
            prv= temp;
            temp= temp.next;
        }
        
        return head;
    }
    int gcd(int a, int b)
    {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }
    
}