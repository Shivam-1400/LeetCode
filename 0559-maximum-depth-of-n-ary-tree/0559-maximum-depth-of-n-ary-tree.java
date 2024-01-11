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
    public int maxDepth(Node root) {
        int ans= getHeight(root);
        return ans;
    }
    int getHeight(Node rt){
        if(rt== null){
            return 0;
        }
        int n= rt.children.size();
        int mx= 0;
        for(int i=0; i<n; i++){
            mx= Math.max(mx, getHeight(rt.children.get(i)));
        }
        return mx+1;
    }
}