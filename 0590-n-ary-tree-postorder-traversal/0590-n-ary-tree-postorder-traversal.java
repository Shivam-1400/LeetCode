/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> order=new ArrayList<>();
        postOrder(root,order);
        return order;
    }
    private void postOrder(Node rt,List<Integer> order){
        if(rt!=null){
            for(int i=0;i<rt.children.size();i++){
                postOrder(rt.children.get(i),order);
            }
            order.add(rt.val);
        }
    }
}