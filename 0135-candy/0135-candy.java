class Solution {
    public int candy(int[] ratings) {
        int n=  ratings.length;
        
        int a[]= new int[n];
        int b[]= new int[n];        
        
        int ax= n;
        for(int i=1; i< n; i++){
            if(ratings[i-1]<ratings[i]){
                a[i]= a[i-1]+1;
            }
        }
        for(int i=n-2; i>=0; i--){
            if(ratings[i]>ratings[i+1]){
                b[i]= b[i+1]+1;
            }
        }
        for(int i=0; i< n; i++){
            ax= ax+ Math.max(a[i], b[i]);
        }
        
        return ax;
    }
}

