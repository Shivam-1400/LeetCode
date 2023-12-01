class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String a= "";
        for(String x: word1){
            a+= x;
        }
        String b= "";
        for(String x: word2){
            b+= x;
        }
        return a.equals(b);
    }
}