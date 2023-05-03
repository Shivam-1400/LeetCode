class Solution {
    public int climbStairs(int n) {
        int[] a= new int[46];
        a[0]=0;
        a[1]=1;
        a[2]=2;
        a[3]=3;
        for(int i=3; i<=n; i++){
            a[i]= a[i-1]+ a[i-2];
        }
        return a[n];
    }
};