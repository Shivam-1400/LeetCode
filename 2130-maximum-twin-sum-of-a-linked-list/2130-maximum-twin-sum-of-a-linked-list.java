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
    public int pairSum(ListNode head) {
        
        ListNode tt= head;
        
        int count=0;
        while(tt != null){
            count++;
            tt= tt.next;
        }
        Stack<ListNode> st1= new Stack<>();
        
        int n= count/2;
        
        ListNode temp= head;
        while(n> 0){
            st1.push(temp);
            temp= temp.next;
            n--;
        }
         // System.out.println("temp val= "+temp.val);
        // temp= temp.next;
        int ans=0;
        int sm=0;
        while(temp!= null){
            sm= st1.pop().val+ temp.val;
            // System.out.println(sm+" "+ans);
            temp= temp.next;
            ans= Math.max(sm, ans);
        }
        ans= Math.max(sm, ans);
        return ans;
        
            
        
        
    }
}