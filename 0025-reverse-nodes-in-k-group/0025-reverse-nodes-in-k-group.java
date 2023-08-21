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
    public ListNode reverseKGroup(ListNode head, int k){
        if(head== null){
            return head;
        }
        List<Integer> ax= new ArrayList<>();
        
        while(head!= null){
            ax.add(head.val);
            head= head.next;
        }
        
        
        for(int i=0; i< ax.size(); ){
            doRev(i, i+k-1, ax);
            i=i+k;
        }
        System.out.println(ax);
        
        head= new ListNode(ax.get(0));
        ListNode ans= head;
        // head= head.next;
        for(int i=1; i< ax.size(); i++){
            head.next= new ListNode(ax.get(i));
            head= head.next;
        }
        
        
        return ans;
        
    }
    void doRev(int st, int ed, List<Integer> ax){
        if(ed >=ax.size()){
            return;
        }
        while(st < ed){
            int t1= ax.get(st);
            
            int t2= ax.get(ed);
            
            ax.set(st, t2);
            ax.set(ed, t1);
            st++;
            ed--;
        }
    }
//     public ListNode reverseKGroup(ListNode head, int k) {
//         Stack<ListNode> st= new Stack();
//         int c=0;
//         int flag=0;
//         ListNode temp= head;
//         ListNode ansHead= head;
//         ListNode curH= head;
        
//         while( temp!= null){
//             if(c<k){
//                 st.push(temp);
//             }
            
            
            
//             temp= temp.next;
//             c++;
            
//             if(c==k){                
//                 curH= st.pop();
//                 if(flag ==0){
//                     ansHead= curH;
//                     flag=1;
//                     while(!st.isEmpty()){
//                         curH.next= st.pop();
//                         curH= curH.next;
//                     }
//                 }
//                 else{
//                     while(!st.isEmpty()){
//                         curH.next= st.pop();
//                         curH= curH.next;
//                     }
//                 }
                
//                 c=0;
//             }
            
//         }
        
//         return ansHead;
        
//     }
}