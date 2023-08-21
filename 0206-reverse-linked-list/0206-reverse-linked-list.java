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
    public ListNode reverseList(ListNode head) {
        if(head== null){
            return head;
        }
        List<Integer> ax= new ArrayList<>();
        ListNode temp= head;
        while(temp != null){
            ax.add(temp.val);
            temp= temp.next;
        }
        ListNode head2= head;
        for(int i=ax.size()-1; i>=0; i--){
            head.next= new ListNode(ax.get(i));
            head= head.next;
        }
        return head2.next;
    }
}