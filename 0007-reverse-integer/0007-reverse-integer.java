class Solution {
    long doRev(int x){
        long num=0;
        while(x != 0){
            long temp= x%10;
            x= x/10;
            num= num*10+ temp;
        }
        return num;
    }
    public int reverse(int x) {
        int flag=1;
        // if(x<0){
        //     flag=0;
        //     x= -x;
        // }
        long a= doRev(x);
        System.out.println(a);
        if(a> Integer.MAX_VALUE || a< Integer.MIN_VALUE){
            return 0;
        }
        if(flag== 0){
            // return 0+aa;
            return (int)-a;
        }
        else{
            return (int)a;
        }
    }
}