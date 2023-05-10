class Solution {
    public int[][] generateMatrix(int n) {
        int[][] ans= new int[n][n];
        
        int top=0;
        int bottom= n-1;
        int left=0;
        int right= n-1;
        int count=1;
        
        while(top<=bottom && left<=right){
            for(int i= left; i<=right; i++){
                ans[top][i]= count++;
            }
            top++;
            
            for(int i= top; i<=bottom; i++){
                ans[i][right]= count++;
            }
            right--;
            
            if(top<=bottom){
                for(int i= right; i>=left; i--){
                    ans[bottom][i]= count++;
                }
                bottom--;
            }
            
            
            if(left<=right){
                for(int i=bottom; i>=top; i--){
                    ans[i][left]= count++;
                }
                left++;
            }      
            
            
        }
        
        return ans;
    }
}