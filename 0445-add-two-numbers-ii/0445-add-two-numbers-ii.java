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
        Stack<Integer> s1= new Stack<>();
        
        while(l1 != null){
            s1.push(l1.val);
            l1= l1.next;
        }
        // System.out.println(s1);
        
        Stack<Integer> s2= new Stack<>();
        
        while(l2 != null){
            s2.push(l2.val);
            l2= l2.next;
        }
        // System.out.println(s2);
        
        Stack<Integer> s3= new Stack<>();
        int carry=0;
        while(s1.size()!= 0 && s2.size()!= 0){
            int sm= s1.pop()+ s2.pop()+ carry;
            carry= sm/10;
            s3.push(sm%10);
        }
        
        if(s1.size()> 0){
            while(s1.size() !=0){
                int sx= carry+s1.pop();
                carry= sx/10;
                s3.push(sx%10);
            }
        }
        else if(s2.size()> 0){
            while(s2.size() !=0){
                int sx= carry+s2.pop();
                carry= sx/10;
                s3.push(sx%10);
            }           
        }  
        if(carry>0){
            s3.push(carry);
        }
        System.out.println(s3);
        
        
        ListNode head= new ListNode();
        ListNode temp= head;
        while(s3.size() !=0){
            ListNode ax= new ListNode(s3.pop());
            temp.next= ax;
            temp= temp.next;
        }
        
        return head.next;
    }
}