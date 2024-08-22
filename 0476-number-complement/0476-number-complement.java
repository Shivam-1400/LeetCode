class Solution {
    public int findComplement(int num) {
        int n  = num;
        int count=0;
        int mask=1;
        while(n!=0){
            n=n>>1;
            count++;
        }
        int i=0;
        
        while(i<count){
            num = num^mask;
            mask = mask<<1;
            i++;
        }

        return num;
        
    }
}