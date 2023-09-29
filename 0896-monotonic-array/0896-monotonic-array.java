class Solution {
    public boolean isMonotonic(int[] a) {
        int n= a.length;
        if(n==1){
            return true;
        }
        boolean x= false;
        boolean y= false;
        for(int i=0; i< n-1; i++){
            if(a[i]==a[i+1]){
                continue;
            }
            else if(a[i]<a[i+1]){
                x= true;
            }
            else if(a[i]>a[i+1]){
                y= true;
            }
        }        
        return (!x||!y);
    }
}