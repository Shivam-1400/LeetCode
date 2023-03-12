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
    public ListNode mergeKLists(ListNode[] lists) {
        
        
        Map<Integer, Integer> mp= new TreeMap<>();
        
        int n= lists.length;
        for(int i=0;i< n; i++){
            while(lists[i] != null){
                int x= lists[i].val;
                if(mp.containsKey(x)){
                    mp.put(x, mp.get(x)+1);
                }else{
                    mp.put(x, 1);
                }
                lists[i]= lists[i].next;
            }
        }
        // Map.Entry<String,String> entry : gfg.entrySet()
        ListNode head= new ListNode(0);
        ListNode bb= head;
        head= bb;
        for(Map.Entry<Integer, Integer> e: mp.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
            int aa= e.getKey();
            int x= e.getValue();
            
            while(x-- >0){
                bb.next= new ListNode(aa);
                bb= bb.next;
            }
        }
        return head.next;
    }
    
    
//     ListNode ans;
//         int n= lists.length;
//         ListNode[] temp= new listNode[n];
//         for(int i=0; i< n; i++){
//             temp[i]= lists[i];
//         }
//         while(true){
//             int a;
//             for(int i=1; i< n; i++){
//                 a= MATH.min(temp[1].val, temp[i].val);
//             }
            
//         }
}