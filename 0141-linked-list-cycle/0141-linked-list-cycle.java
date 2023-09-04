/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head== null){
            return false;
        }
        ListNode fs= head;
        ListNode sl= head;
        
        while(fs.next != null && fs.next.next != null){
            sl= sl.next;
            fs= fs.next.next;
            
            if(sl== fs){
                return true;
            }
        }
        return false;
    }
}

// public class Solution {
//     public boolean hasCycle(ListNode head) {
//         if (head == null) {
//             return false;
//         }
//         ListNode slow = head;
//         ListNode fast = head;
        
//         while (fast.next != null && fast.next.next != null) {
//             fast = fast.next.next;
//             slow = slow.next;
            
//             if (fast == slow) {
//                 return true;
//             }
//         }
        
//         return false;
//     }
// }