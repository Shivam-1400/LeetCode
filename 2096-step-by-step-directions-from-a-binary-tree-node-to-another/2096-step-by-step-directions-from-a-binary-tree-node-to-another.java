class Solution {
      public boolean dfs(TreeNode root,int x,StringBuilder sb){
        if(root==null) return false;
        if(root.val==x) return true;
        if(dfs(root.left,x,sb)){
             sb.append('L');
             return true;
      }
       if(dfs(root.right,x,sb)) {
       sb.append('R');
       return true;
       }
       return sb.length()>0;
}
 public String getDirections(TreeNode root, int startValue, int destValue) {
     StringBuilder start=new StringBuilder();
     StringBuilder end=new StringBuilder();
     dfs(root,startValue,start);
     dfs(root,destValue,end);
     int left=start.length()-1;
     int right=end.length()-1;
     int count=0;
     while(left>=0&&right>=0){
     if(start.charAt(left)==end.charAt(right)){
           left--;right--;count++;
        }
        else break;

 }
  String ans=new String();
  for(int i=0;i<=start.length()-1-count;i++) ans=ans+'U';
 ans=ans+new String(end.reverse().substring(count));
  return ans;
 }
}