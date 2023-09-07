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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        int n=0;
        ListNode temp= head;
        while(temp!= null){
            n++;
            temp= temp.next;
        }
        int[] ar= new int[n];
        temp= head;
        int i=0;
        while(temp!= null){
            ar[i]= temp.val;
            temp= temp.next;
            i++;
        }
        left--;
        right--;
        while(left< right){
            int a= ar[right];
            ar[right]= ar[left];
            ar[left]= a;
            left++;
            right--;
        }
        ListNode ans= new ListNode(10);
        ListNode ret= ans;
        
        for(int ix: ar){
            ans.next= new ListNode(ix);
            ans= ans.next;
        }
        return ret.next;
    }
}