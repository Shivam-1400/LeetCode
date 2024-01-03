class Solution {
    int count(String s){
        int cnt=0;
        for(char x: s.toCharArray()){
            if(x=='1')
                cnt++;
        }
        return cnt;
    }
    public int numberOfBeams(String[] bank) {
        int n= bank.length;
        int lzr[]= new int[n];
        int jj=0;
        for(String x: bank){
            lzr[jj]= count(x);
            System.out.print(lzr[jj]+" ");
            jj++;
        }
        int ans =0;
        for(int i=0, j=1; i+1< n && j<n;){
            if(lzr[j]== 0){
                j++;
            }
            else{
                ans+= lzr[i]*lzr[j];
                i= j;
                j++;
            }
        }
        return ans;
    }
}