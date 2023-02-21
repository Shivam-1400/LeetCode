/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<List<Integer>> ans;
    Queue<TreeNode> q; 
    void bfs(TreeNode root){
        
        List<Integer>  pr= new ArrayList<>();
        q= new LinkedList<>();
        int l=0;
        int i=1;
        q.add(root);
        while(q.size() !=0){
            TreeNode temp= q.poll();
            pr.add(temp.val);
            // i++;i++;
            if(temp.left != null){
                q.add(temp.left);

            }
            if(temp.right !=null){
                q.add(temp.right);
            }
            // i++;
            // if(temp == null){
            //     continue;
            // }
            // q.add(temp.left);
            // q.add(temp.right);

            if(--i==0){
                i=q.size();
                if(l==1){
                    Collections.reverse(pr);
                    l=0;
                }else{
                    l=1;
                }
                ans.add(new ArrayList<>(pr));
                pr= new ArrayList();
            }

            // pr.add(temp.val);
            // if(i>Math.pow(2,l)){
            //     l++;
            //     ans.add(new ArrayList<>(pr));[]
            //     pr= new ArrayList();
            //     i--;
            //     i= q.size();

            // }

        }
        // ans.add(pr);
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        ans= new ArrayList<>();
        if(root== null){
            return ans;
        }
        
        bfs(root);
        int flag=0;
        // for(int i=0; i< ans.size(); i++){
        //     if(flag==1){

        //     }else{
        //         flag=0;
        //     }
        // }
        return ans;
    }
}