class Solution {
    public boolean halvesAreAlike(String s) {
        int n= s.length();
        int fc= 0;
        int bc= 0;
        for(int i=0; i<n/2; i++){
            if(isVowel(s.charAt(i))){
                fc++;
            }

            if(isVowel(s.charAt(n-i-1))){
                bc++;
            }
        }
        return fc==bc;
    }
    boolean isVowel(char x){
        if(x=='a' || x=='e'|| x=='i'|| x=='o'|| x=='u' || x=='A' || x=='E'|| x=='I'|| x=='O'|| x=='U'){
            return true;
        }
        return false;
    }
}