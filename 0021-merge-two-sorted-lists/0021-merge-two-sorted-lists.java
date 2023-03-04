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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode r = new ListNode();
        ListNode head = r;
        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
               r.next = list1;
               list1 = list1.next;
            }else{
              r.next = list2;
              list2 = list2.next;
            }
            
            r = r.next;
        }       
        
        if(list1!=null){
            r.next=list1;
        }else{
            r.next=list2;
        }
        
        return head.next;
    
    }
}