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
    public ListNode[] splitListToParts(ListNode head, int k) {
        int cn=0;
        ListNode temp= head;
        while(temp != null){
            cn++;
            temp= temp.next;
        }
        int sz= cn/k;
        int ex= cn%k;
        
        System.out.println(sz+" "+ex);
        
        ListNode[] ans= new ListNode[k];
        temp = head;
        for(int i=0; i<k; i++){
            ans[i]= temp;
            int csz= sz+ (ex>0 ? 1:0);
            ex--;
            while(csz >1 && temp != null){
                temp= temp.next;
                csz--;
            }
            if(temp != null){
                ListNode nxt= temp.next;
                temp.next= null;
                temp= nxt;
            }
            
            
        }
        return ans;
    }
}


            // result[i] = temp;
            // int currentPartSize = partSize + (extra-- > 0 ? 1 : 0);
            // for (int j = 0; j < currentPartSize - 1; j++) {
            //     temp = temp.next;
            // }
            // if (temp != null) {
            //     ListNode next = temp.next;
            //     temp.next = null;
            //     temp = next;
            // }