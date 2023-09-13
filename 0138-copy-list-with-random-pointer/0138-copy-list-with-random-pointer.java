/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

// class Solution {
//     public Node copyRandomList(Node head) {
        
//         Node temp= head;
//         Node ans= new NOde();
//         Node cpy= ans;
        
//         while(temp != null){
//             int x= temp.val;
//             cpy.next= new Node(x);
//             temp= temp.next;
//             cpy= cpy.next;
//         }
        
//         temp= head;
//         cpy= ans;
        
        
        
        
        
        
//     }
// }

class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) return null;
        
        Map<Node, Node> map = new HashMap<>();
        Node current = head;
        
        while (current != null) {
            map.put(current, new Node(current.val));
            current = current.next;
        }
        
        current = head;
        
        while (current != null) {
            Node copyNode = map.get(current);
            copyNode.next = map.get(current.next);
            copyNode.random = map.get(current.random);
            current = current.next;
        }
        
        return map.get(head);
    }
}