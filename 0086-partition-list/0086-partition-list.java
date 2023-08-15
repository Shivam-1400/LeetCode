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
    public ListNode partition(ListNode head, int x) {
        ListNode dummy= new ListNode(0);
        ListNode head2= dummy;
        List<Integer> ax= new ArrayList<>();
        List<Integer> bx= new ArrayList<>();
        ListNode temp= head;
        while(temp != null){
            if(temp.val < x){
                ax.add(temp.val);
            }
            else{
                bx.add(temp.val);
            }
            temp= temp.next;
        }
        for(int i=0; i< ax.size(); i++ ){
            dummy.next= new ListNode(ax.get(i));
            dummy= dummy.next;
        }
        for(int i=0; i< bx.size(); i++ ){
            dummy.next= new ListNode(bx.get(i));
            dummy= dummy.next;
        }
        return head2.next;
    }
}