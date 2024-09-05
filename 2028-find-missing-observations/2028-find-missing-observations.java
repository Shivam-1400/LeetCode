class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int rem = (rolls.length+n)*mean;
        for(int i: rolls) rem -=i;
        if(rem > 6*n || rem<n) return new int[0];
        int val = rem/n;
        int mod = rem%n;
        int []v  = new int[n];
        for(int i=0; i<n; i++) v[i] = val;
        for(int i=0; i<n; i++){
            if(mod == 0) break;
            int dif = 6-v[i];
            if(dif<mod){
                v[i] +=dif;
                mod -=dif;
            }
            else{
                v[i] +=mod;
                mod = 0;
            }
        }
        return v;
    }
}