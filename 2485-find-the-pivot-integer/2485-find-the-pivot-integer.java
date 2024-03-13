class Solution {
    public int pivotInteger(int n) {
        int sm= (n*(n+1))/2;
        int sm1=0;
        int sm2=0;
        for(int i=1; i<=n; i++){
            sm1= i *(i+1)/2;
            sm2= sm- (i-1)*i/2;
            
            System.out.println(i+"    "+sm1+"   "+ sm2);
            if(sm1== sm2){
                return i;
            }
        }
        return -1;
        
    }
}
