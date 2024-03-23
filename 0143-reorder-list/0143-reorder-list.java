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
    public void reorderList(ListNode head) {
        ListNode cur=new ListNode(0);
        Deque<ListNode> deque=new ArrayDeque<>();
        while(head!=null){
            deque.add(head);   
            head=head.next;
        }
        while(!deque.isEmpty()){ 
            cur.next=deque.removeFirst();
            cur=cur.next;
            if(!deque.isEmpty()){
                cur.next=deque.removeLast();
                cur=cur.next;
            }
        }
        cur.next=null; //to break the cycle lat element may be have bond with another element 
    }
}