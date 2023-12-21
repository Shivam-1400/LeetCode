class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int n= points.length;
        int[] ar= new int[n];
        
        for(int i=0; i< n; i++){
            ar[i]= points[i][0];
            // System.out.print(ar[i]+" ");
        }
        
        Arrays.sort(ar);
       
        int ans= ar[1]- ar[0];
        for(int i=1; i< n; i++){
            // if(ar[i]== ar[i-1]){
            //     continue;
            // }
            ans= Math.max(ans, ar[i]- ar[i-1]);
        }
        return ans;
    }
}