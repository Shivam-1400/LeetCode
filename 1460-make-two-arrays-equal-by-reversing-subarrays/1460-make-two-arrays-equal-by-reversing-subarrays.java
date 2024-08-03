class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        if(target.length!=arr.length) 
            return false;
        
        int[] freq=new int[1001];
        for(int i: target){
            freq[i]++;
        }
        for(int i: arr){
            if(freq[i]==0){
                return false;
            } 
            freq[i]--;
        }
        return true;
    }
}