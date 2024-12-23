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
    public int minimumOperations(TreeNode root) {
        int ans=0;
        Queue<TreeNode> q= new LinkedList();
        q.offer(root);
        while(!(q.isEmpty())){
            int poll = q.size();
            int [] curLvl = new int [poll];
            for (int i=0;i<poll;i++){
                TreeNode next = q.poll();
                curLvl[i]=next.val;
                if (next.left!=null) q.offer(next.left);
                if (next.right!=null) q.offer(next.right);
            }       
            if (poll>1) ans+=countSwaps(curLvl);
            //if (poll==4) return ans*1000;
        }
        return ans;
    }

    public int countSwaps(int[] nums){
        int ans=0;
        for (int i=0;i<nums.length;i++){      
            int swap=-1,min=nums[i];  
            for (int j=i+1;j<nums.length;j++){        
                if (nums[j]<min){
                    min=nums[j];
                    swap=j;
                }
            }
            if (swap==-1) continue;
            int tmp = nums[i];
            nums[i]=nums[swap];
            nums[swap]=tmp;
            ans++;
        }
        return ans;
    }
}