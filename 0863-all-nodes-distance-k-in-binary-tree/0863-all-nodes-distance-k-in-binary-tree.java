/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    Map<Integer, Integer> visited;
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        
        Map<Integer, TreeNode> parent= new HashMap<>();
        Queue<TreeNode> qe= new LinkedList<>();
        qe.add(root);
        parent.put(root.val, null);
        while(!qe.isEmpty() && k>=0){
            int sz= qe.size();
            
            for(int i=0; i< sz; i++){
                TreeNode temp= qe.remove();
                
                if(temp.right != null){
                    parent.put(temp.right.val, temp);
                    qe.add(temp.right);
                }
                if(temp.left != null){
                    parent.put(temp.left.val, temp);
                    qe.add(temp.left);
                }
            }
        }
        
        List<Integer> ans= new ArrayList<>();
        // ans.addAll(getNodeAtK(target, k));
        
        visited = new HashMap<>();
        TreeNode p= target;

        while(k>=0 && p!=null){
            
            List<Integer> t= getNodeAtK(p, k);
            System.out.println(t);
            // if(t.size() > 0){
                ans.addAll(t);
            System.out.println(ans);
            // }
            k--;
            p= parent.get(p.val);
            
        }
        // ans.remove(Integer.valueOf(target.val));
        return ans;
       
    }
    List<Integer> getNodeAtK(TreeNode target, int k){
        Queue<TreeNode> qe= new LinkedList<>();
        List<Integer> ax= new ArrayList<>();
        System.out.println(target.val+" "+k);
        qe.add(target);
        while(!qe.isEmpty() && k>=0){
            int sz= qe.size();
            
            for(int i=0; i< sz; i++){
                TreeNode temp= qe.remove();
                visited.put(temp.val, 1);
                if(k==0 ){
                    ax.add(temp.val);
                    continue;
                }
                
                if(temp.right != null && !visited.containsKey(temp.right.val)){
                    qe.add(temp.right);
                }
                if(temp.left != null && !visited.containsKey(temp.left.val)){
                    qe.add(temp.left);
                }
            }k--;
        }
        System.out.println(ax);
        return ax;
    }
}

// class Solution {
//     public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
//         List<Integer> ans = new ArrayList<>();
//         Map<Integer, TreeNode> parent = new HashMap<>();
//         Queue<TreeNode> queue = new LinkedList<>();
//         queue.offer(root);

//         while (!queue.isEmpty()) {
//             int size = queue.size();
//             for (int i = 0; i < size; i++) {
//                 TreeNode top = queue.poll();

//                 if (top.left != null) {
//                     parent.put(top.left.val, top);
//                     queue.offer(top.left);
//                 }

//                 if (top.right != null) {
//                     parent.put(top.right.val, top);
//                     queue.offer(top.right);
//                 }
//             }
//         }

//         Map<Integer, Integer> visited = new HashMap<>();
//         queue.offer(target);
//         while (k > 0 && !queue.isEmpty()) {
//             int size = queue.size();

//             for (int i = 0; i < size; i++) {
//                 TreeNode top = queue.poll();

//                 visited.put(top.val, 1);

//                 if (top.left != null && !visited.containsKey(top.left.val)) {
//                     queue.offer(top.left);
//                 }

//                 if (top.right != null && !visited.containsKey(top.right.val)) {
//                     queue.offer(top.right);
//                 }

//                 if (parent.containsKey(top.val) && !visited.containsKey(parent.get(top.val).val)) {
//                     queue.offer(parent.get(top.val));
//                 }
//             }

//             k--;
//         }

//         while (!queue.isEmpty()) {
//             ans.add(queue.poll().val);
//         }
//         return ans;
//     }
// }