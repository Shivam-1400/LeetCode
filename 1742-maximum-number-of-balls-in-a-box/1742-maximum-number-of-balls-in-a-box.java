class Solution {
    int getDigSum(int n){
        int sm=0;
        while(n >0){
            sm+= n%10;
            n= n/10;
        }
        return sm;
    }
    public int countBalls(int ll, int hl) {
        int n= hl+ ll -1;
        
        Map<Integer, Integer> mp= new HashMap<>();
        for(int i= ll; i<=hl; i++){
            int sm= getDigSum(i);
            mp.put(sm, mp.getOrDefault(sm, 0)+1);
        }
        
        int ans=0;
        
        for(Map.Entry<Integer, Integer> x: mp.entrySet()){
            ans= Math.max(ans, x.getValue());
        }
        return ans;
    }
}